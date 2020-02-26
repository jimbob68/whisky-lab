package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {

    @Autowired
    EntityManager entitymanager;

    public List<Distillery> findAllDistilleriesInAParticularArea(String region){
      List<Distillery> result = null;
      Session session = entitymanager.unwrap(Session.class);

        Criteria cr = session.createCriteria(Distillery.class);

        cr.add(Restrictions.eq("region", region));
        result = cr.list();
        return result;
    }
}
