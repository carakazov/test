package com.example.service;

import com.example.DAO.IDAO;
import com.example.DAO.WorkersDAO;
import com.example.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service implements IService{
    @Autowired
    private IDAO workersDAO;

    public String getName(int id){
        return workersDAO.getName(id);
    }

    public Worker getById(int id){
        return workersDAO.getById(id);
    }
}
