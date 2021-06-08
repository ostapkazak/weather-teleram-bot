package com.ostapdev.weathertelerambot.services;

import com.ostapdev.weathertelerambot.repos.BotConfigRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class Bot extends TelegramLongPollingBot {
    @Autowired
    private BotConfigRepo botConfigRepo;

    @Override
    public String getBotUsername() {
        return botConfigRepo.findAll().get(0).getName();
    }

    @Override
    public String getBotToken() {
        return botConfigRepo.findAll().get(0).getAccessToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().toString());
        update.getUpdateId();
        SendMessage.SendMessageBuilder messageBuilder = SendMessage.builder();
        String messageText;
        String chatId;
        if (update.getMessage() != null) {
            chatId = update.getMessage().getChatId().toString();
            messageBuilder.chatId(chatId);
            messageText = update.getMessage().getText();
        } else {
            chatId = update.getChannelPost().getChatId().toString();
            messageBuilder.chatId(chatId);
            messageText = update.getChannelPost().getText();
        }

        if (messageText.contains("/hello")) {
            messageBuilder.text("Привет");
            try {
                execute(messageBuilder.build());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (messageText.contains("/chartId")) {
            messageBuilder.text("ID Канала : " + chatId);
            try {
                execute(messageBuilder.build());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
