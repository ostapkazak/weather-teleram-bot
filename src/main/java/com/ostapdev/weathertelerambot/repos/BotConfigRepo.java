package com.ostapdev.weathertelerambot.repos;

import com.ostapdev.weathertelerambot.models.BotConfig;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

public interface BotConfigRepo extends MongoRepository<BotConfig, BigInteger> {
}
