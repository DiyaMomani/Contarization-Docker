package com.example.analytics.Analytics;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Service;

@Service
public class AnaService {
    @PersistenceContext
    private EntityManager ent;

    public Integer getAvgAgeOfPatient(){
        Query query = ent.createNativeQuery(
                "SELECT AVG(age) FROM patient;"
        );
        Object result = query.getSingleResult();
        System.out.println(result.toString());
        double avgAge = Double.parseDouble(result.toString());
        return (int) avgAge;
    }
    public Integer getMin(){
        Query query = ent.createNativeQuery(
                "SELECT MIN(age) FROM patient;"
        );
        Object result = query.getSingleResult();
        System.out.println(result.toString());
        double avgAge = Double.parseDouble(result.toString());
        return (int) avgAge;
    }
    public Integer getMax(){
        Query query = ent.createNativeQuery(
                "SELECT MAX(age) FROM patient;"
        );
        Object result = query.getSingleResult();
        System.out.println(result.toString());
        double avgAge = Double.parseDouble(result.toString());
        return (int) avgAge;
    }
}
