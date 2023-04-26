package com.example.analytics.Analytics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnaController {
    private AnaService anaService;
    @Autowired
    private AnaRepository anaRepository;
    @Autowired
    public void setAnalyticsService(AnaService anaService){
        this.anaService = anaService;
    }
    @PostMapping(value = "/update")
    public void updateAnalytics() {
        Integer avgAgeOfStudent = anaService.getAvgAgeOfPatient();
        Integer min= anaService.getMin();
        Integer max=anaService.getMax();
        Analytics doc = new Analytics(avgAgeOfStudent,min,max);
        anaRepository.save(doc);
    }

}
