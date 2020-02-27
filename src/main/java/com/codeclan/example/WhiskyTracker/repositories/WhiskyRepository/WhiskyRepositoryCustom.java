package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {
    public List<Whisky> findWhiskyByYear(int year);
    public List<Whisky> findWhiskyByDistilleryAndAge(int age, String name);
//    public List<Whisky> findAllWhiskiesByRegion( String name, String region);
}
