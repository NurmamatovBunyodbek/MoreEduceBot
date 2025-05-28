package org.example.moreeducebot.model;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()){
            if (update.getMessage().getText().equals(update.getMessage().getText())){
                System.out.println(update.getMessage().getText());
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "moreeduce_bot";
    }

    @Override
    public String getBotToken() {
        return "7610719850:AAFVG5yIVM1MLBANvti_8AThJSAwMbyjrm8";
    }
}
