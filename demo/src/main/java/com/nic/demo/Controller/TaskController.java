package com.nic.demo.Controller;

import com.nic.demo.Model.Task;
import com.nic.demo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class TaskController {
    private final TaskRepository tasks;

    @Autowired

    public TaskController(TaskRepository tasks) {
        this.tasks = tasks;
    }

    @RequestMapping("/")

    public ModelAndView addTask() {
        return new ModelAndView("createTask.html","task",new Task());
    }

    @RequestMapping(value = "/addTask", method = RequestMethod.POST)
    public RedirectView addNewTask(Task task) {
        tasks.save(task);
        return new RedirectView("/allTasks");

    }

    @RequestMapping("/allTasks")
    public ModelAndView allTasks(ModelMap modelMap){
        modelMap.addAttribute("tasks",tasks.findAll());
        return new ModelAndView("taskList.html",modelMap);
    }
}
