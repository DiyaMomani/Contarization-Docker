package com.example.result.Analytics;

import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
public class Analytics {
    private Integer avgAgeOfPatient;
    private Integer min;
    private Integer max;

    public Integer getAvgAgeOfPatient() {
        return avgAgeOfPatient;
    }

    public void setAvgAgeOfPatient(Integer avgAgeOfPatient) {
        this.avgAgeOfPatient = avgAgeOfPatient;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }
}
