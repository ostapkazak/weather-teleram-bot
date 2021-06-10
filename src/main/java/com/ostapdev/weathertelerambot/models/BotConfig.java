package com.ostapdev.weathertelerambot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "bot_config")
public class BotConfig {
    @Id
    private BigInteger id;

    private String name;

    private String accessToken;

    private String nowWeatherApiTemp;

    private String predictWeatherApiTemp;

    private String telegramCallbackAnswerTemp;

    private List<Command> commands;
}
