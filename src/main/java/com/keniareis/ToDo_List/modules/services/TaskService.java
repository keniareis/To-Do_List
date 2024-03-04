package com.keniareis.ToDo_List.modules.services;

import com.keniareis.ToDo_List.modules.models.Task;

import java.security.PublicKey;
import java.time.LocalDateTime;

public class TaskService {

    public void addTask(String description, LocalDateTime deadline){
        Task task = new Task(description, deadline);
    }

    public void upgradeTask(Long id, String description){

    }

    public void removeTask(Long id){

    }

    public void searchTask(boolean completed){

    }
}
