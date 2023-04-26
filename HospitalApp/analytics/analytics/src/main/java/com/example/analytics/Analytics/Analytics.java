package com.example.analytics.Analytics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "analytics")
@Setter
@Getter
@AllArgsConstructor
public class Analytics {
    private Integer avgAgeOfPatient;
    private Integer min;
    private Integer max;
}
