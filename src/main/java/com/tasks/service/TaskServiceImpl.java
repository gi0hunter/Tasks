package com.tasks.service;

import com.tasks.domain.Task;
import com.tasks.repository.TaskRepository;

public class TaskServiceImpl implements  TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }
}
