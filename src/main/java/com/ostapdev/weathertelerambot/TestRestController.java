package com.ostapdev.weathertelerambot;

import com.ostapdev.weathertelerambot.models.BotConfig;
import com.ostapdev.weathertelerambot.repos.BotConfigRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestRestController {
    @Autowired
    private BotConfigRepo botConfigRepo;

    @GetMapping
    public BotConfig botConfig(){
        return botConfigRepo.findAll().get(0);
    }
}
