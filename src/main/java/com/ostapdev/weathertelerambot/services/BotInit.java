package com.ostapdev.weathertelerambot.services;

import com.ostapdev.weathertelerambot.botapi.WeatherBot;
import com.ostapdev.weathertelerambot.models.LogStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Component
public class BotInit {
    @Autowired
    private WeatherBot weatherBot;
    @Autowired
    private LogService logService;

    @EventListener({ApplicationReadyEvent.class})
    public void init() throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        try {
            telegramBotsApi.registerBot(weatherBot);
        } catch (TelegramApiRequestException e) {
            logService.addLog(LogStatus.ERROR, e.getMessage());
        }
    }
}
