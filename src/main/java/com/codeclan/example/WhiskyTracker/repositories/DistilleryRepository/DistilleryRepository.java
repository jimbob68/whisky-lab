package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistilleryRepository extends JpaRepository<Distillery, Long>, DistilleryRepositoryCustom {
    public List<Distillery> findAllDistilleriesInAParticularArea(String region);
//    public List<Whisky> findAllWhiskyByRegion(String name, String region);
    public List<Whisky> findAllWhiskiesByRegion(String region);
}
