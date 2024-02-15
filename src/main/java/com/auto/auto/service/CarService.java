package com.auto.auto.service;

import com.auto.auto.repositories.CarRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    private CarRepositories carRepositories;
}
