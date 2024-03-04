package com.keniareis.ToDo_List.services;

import com.keniareis.ToDo_List.models.Task;

import java.time.LocalDateTime;

public class TaskService {


    public void newTask(String description, LocalDateTime deadline){
        Task task = new Task(description, deadline);
    }
}
