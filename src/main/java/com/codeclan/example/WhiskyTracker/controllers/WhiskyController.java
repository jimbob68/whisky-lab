package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/search/findWhiskyByYear")
    public List<Whisky> findWhiskyByYear(@RequestParam int year){
        return whiskyRepository.findWhiskyByYear(year);
    }

    @GetMapping(value = "/findWhiskyByDistilleryAndAge")
    public List<Whisky> findWhiskyByDistilleryAndAge(@RequestParam int age, @RequestParam String name){
        return whiskyRepository.findWhiskyByDistilleryAndAge(age, name);
    }
//    @GetMapping(value = "/findAllWhiskiesByRegion")
//    public List<Whisky> findAllWhiskiesByRegion(@RequestParam String name, @RequestParam String region){
//        return whiskyRepository.findAllWhiskiesByRegion(name, region);
//    }

}
