package com.grace.taskmanagementsystem.controller;

import com.grace.taskmanagementsystem.model.Task;
import com.grace.taskmanagementsystem.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;


    @GetMapping
    public String getAllTasks(Model model){
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "task-list";
    }


}

/**
 * Create the TaskController Class
 * Tasks:
 *
 * Create a REST controller (TaskController) to expose task management functionality through HTTP endpoints.
 * Implement the following endpoints:
 * GET /api/tasks to retrieve all tasks.
 * GET /api/tasks/{id} to retrieve a specific task by its ID.
 * POST /api/tasks to create a new task.
 * PUT /api/tasks/{id} to update an existing task by ID:
 * Ensure that the PUT request body includes the updated task data.
 * Validate that the task exists before updating it.
 * DELETE /api/tasks/{id} to delete a task by ID.
 * Hints:
 *
 * Use @GetMapping, @PostMapping, @PutMapping, and @DeleteMapping for handling HTTP requests.
 */