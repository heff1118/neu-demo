package com.example.NEUDemo.controller;

import com.example.NEUDemo.domain.Task;
import com.example.NEUDemo.service.TODOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class ServiceController {

    @Autowired
    private TODOService todoService;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = todoService.getAllTasks();
        return ResponseEntity.ok(tasks);
    }


    @PostMapping
    @ResponseBody
    public ResponseEntity<?> saveTask(@RequestBody Task task) {
        todoService.saveTask(task);
        return ResponseEntity.ok("Okay");
    }
}
