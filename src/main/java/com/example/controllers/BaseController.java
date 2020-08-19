package com.example.controllers;

import com.example.DAO.WorkersDAO;
import com.example.model.Worker;
import com.example.service.IService;
import com.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaseController {

    @Autowired
    private IService service;

    /*@GetMapping("/workers")
    public List<?> showAllWorkers(){
        return workersDAO.getAll();
    }*/

    @GetMapping("/workers/{id}")
    public Worker showWorker(@PathVariable(value = "id") int id){
        return service.getById(id);
    }
/*
    @GetMapping("/workers/name/{id}")
    public String getName(@PathVariable(value = "id") int id){
        return workersDAO.getName(id);
    }*/

    @GetMapping("/workers/name/{id}")
    public String getName(@PathVariable(value = "id") int id){
        return service.getName(id);
    }
}
