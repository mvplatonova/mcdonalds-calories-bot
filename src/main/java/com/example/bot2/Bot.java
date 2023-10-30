package com.example.bot2;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;

public class Bot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        Message msg = update.getMessage();
        User user = msg.getFrom();
        System.out.println(user.getFirstName() + " wrote " + msg.getText());
    }

    @Override
    public String getBotToken() {
        return Constants.TOKEN;
    }

    @Override
    public String getBotUsername() {
        return Constants.BOT_NAME;
    }
    
}
