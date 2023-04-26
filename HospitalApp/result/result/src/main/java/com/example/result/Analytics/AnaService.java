package com.example.result.Analytics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnaService {
    @Autowired
    private AnaRepository analyticsRepo;

    public List<Analytics> getAnalysisData(){
        return analyticsRepo.findAll();
    }
}
