package app.repository;

import app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    public Student findFirstByUsername(String username);

    List<Student> findAllByFacultyNumberStartingWith(String facultyNumber);

}
