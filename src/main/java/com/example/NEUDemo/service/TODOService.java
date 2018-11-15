package com.example.NEUDemo.service;

import com.example.NEUDemo.domain.Task;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TODOService {


    private List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void saveTask(Task task) {
        tasks.add(task);
    }
}
