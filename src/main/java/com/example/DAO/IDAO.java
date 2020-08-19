package com.example.DAO;

import com.example.model.Worker;

import java.util.List;

public interface IDAO{
    Worker getById(int id);
    List<Worker> getAll();

    String getName(int id);
}
