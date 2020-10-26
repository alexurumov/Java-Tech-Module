package todoList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import todoList.bindingModel.TaskBindingModel;
import todoList.entity.Task;
import todoList.repository.TaskRepository;

@Controller
public class TaskController {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/")
    public ModelAndView getAll() {
        return new ModelAndView("base-layout")
                .addObject("view", "task/index")
                .addObject("tasks", this.taskRepository.findAll());
    }

    @GetMapping("/create")
    public ModelAndView create() {
        return new ModelAndView("base-layout")
                .addObject("view", "task/create");
    }

    @PostMapping("/create")
    public ModelAndView create(TaskBindingModel model) {
        Task task = new Task();
        task.setTitle(model.getTitle());
        task.setComments(model.getComments());

        this.taskRepository.save(task);

        return new ModelAndView("redirect:/");
    }

    @GetMapping("edit/{id}")
    public ModelAndView edit(@PathVariable Long id) {
        return new ModelAndView("base-layout")
                .addObject("view", "task/edit")
                .addObject("task", this.taskRepository.findById(id).get());
    }

    @PostMapping("edit/{id}")
    public ModelAndView edit(@PathVariable Long id, TaskBindingModel model) {
        Task task = this.taskRepository.findById(id).get();
        task.setTitle(model.getTitle());
        task.setComments(model.getComments());

        this.taskRepository.save(task);

        return new ModelAndView("redirect:/");
    }

    @GetMapping("delete/{id}")
    public ModelAndView perpareDelete(@PathVariable Long id) {
        return new ModelAndView("base-layout")
                .addObject("view", "task/delete")
                .addObject("task", this.taskRepository.findById(id).get());
    }

    @PostMapping("delete/{id}")
    public ModelAndView processDelete(@PathVariable Long id) {
        this.taskRepository.deleteById(id);

        return new ModelAndView("redirect:/");

    }

}
