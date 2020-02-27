package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface DistilleryRepositoryCustom {
    public List<Distillery> findAllDistilleriesInAParticularArea(String region);
//    public List<Whisky> findAllWhiskyFromAParticularRegion(String name, String region);
    public List<Whisky> findAllWhiskiesByRegion(String region);
}
