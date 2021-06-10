package com.ostapdev.weathertelerambot.repos;

import com.ostapdev.weathertelerambot.models.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;

public interface LogRepo extends MongoRepository<Log, BigInteger> {
}
