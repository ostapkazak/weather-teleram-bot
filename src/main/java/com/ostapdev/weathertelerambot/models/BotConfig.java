package com.ostapdev.weathertelerambot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "bot_config")
public class BotConfig {
    @Id
    private BigInteger id;

    private String name;

    private String accessToken;
}
