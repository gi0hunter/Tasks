package com.tasks.controller;

import com.tasks.domain.Task;
import com.tasks.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping(value =  {"","/"})
    public Iterable<Task> list(){
        return this.taskService.list();
    }
    @RequestMapping("/save")
    public Task saveTask(@RequestBody Task task){
        return this.taskService.save(task);

    }

}
