package com.ostapdev.weathertelerambot;

import com.ostapdev.weathertelerambot.repos.BotConfigRepo;
import com.ostapdev.weathertelerambot.services.Bot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class WeatherTeleramBotApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WeatherTeleramBotApplication.class, args);
    }
}
