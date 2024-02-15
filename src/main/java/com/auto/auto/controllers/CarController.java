package com.auto.auto.controllers;


import com.auto.auto.entities.Cars;
import com.auto.auto.repositories.CarRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Controller
@RequestMapping("/")
public class CarController {

@Autowired
private CarRepositories carRepositories;
@Autowired
private CarService carService;
    @PostMapping(path="/create")
    public Cars addCar(@RequestBody Cars cars){
        return carRepositories.save(cars);
    }
    @GetMapping(path="/getAllCar")
    public List<Cars> getAllCar(){
        return carRepositories.findAll();
    }
    @GetMapping(path="/{id}getById")
    public Optional<Cars> getById(@PathVariable long id){
        return carRepositories.findById(id);
    }
    @GetMapping("getsingle/{id}")
    public Cars getSingle(@PathVariable long id ){
        Cars car = carRepositories.getReferenceById(id);
        return car;
    }
    @GetMapping(path="/getByBrand")
    public List<Cars> getByBrand(@PathVariable long id, @RequestParam Cars carBrand){
        for(Cars c : carBrand){
            if()



        }
    }
}
