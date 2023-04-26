package com.example.result.Analytics;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnaRepository extends MongoRepository<Analytics,Double> {
}
