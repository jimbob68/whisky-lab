package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource
public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {
    public List<Whisky> findWhiskyByYear(int year);
//    public List<Whisky> findWhiskiesByDistilleryNameAndAge(String name, int age);
    public List<Whisky> findWhiskyByDistilleryAndAge(int age, String name);
}
