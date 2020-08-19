package com.example.service;

import com.example.model.Worker;

public interface IService {
    String getName(int id);
    Worker getById(int id);
}
