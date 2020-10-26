package app.controller;

import app.entity.Student;
import app.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@Controller
public class StudentController {

    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students/save/{username}")
    public ModelAndView addStudent(@PathVariable String username) {
        String facultyNumber = UUID.randomUUID().toString();
        Student student = new Student(username, facultyNumber);

        this.studentRepository.save(student);

        return new ModelAndView("student");

    }

    @GetMapping("students/retreive/{username}")
    public ModelAndView getStudent(@PathVariable String username) {
        Student student =  this.studentRepository.findFirstByUsername(username);

        return new ModelAndView("student-info")
                .addObject("student", student);

    }
}
