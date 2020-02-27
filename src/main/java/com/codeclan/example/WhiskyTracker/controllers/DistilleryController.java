package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "/search/findAllDistilleriesInAParticularArea")
    public List<Distillery> findAllDistilleriesInAParticularArea(@RequestParam String region){
        return distilleryRepository.findAllDistilleriesInAParticularArea(region);
    }
    @GetMapping(value = "/findAllWhiskiesByRegion")
    public List<Whisky> findAllWhiskiesByRegion(@RequestParam String region){
        return distilleryRepository.findAllWhiskiesByRegion(region);
    }


}
