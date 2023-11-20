package com.example.bot.ui.keyboard;

import java.util.ArrayList;
import java.util.List;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.api.objects.webapp.WebAppInfo;

public class KeyboardManager {
    
    public static ReplyKeyboardMarkup createReplyKeyboard(List<String> items) {
        List<KeyboardRow> rows = createKeyboardRows(items);
        ReplyKeyboardMarkup replayKeyboard = ReplyKeyboardMarkup.builder().keyboard(rows).build();
        return replayKeyboard;
    }

    private static List<KeyboardRow> createKeyboardRows(List<String> items) {
        List<KeyboardRow> rows = new ArrayList<>();
        if(items == null) {
            return rows;
        }
        List<KeyboardButton> line = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            KeyboardButton button = KeyboardButton.builder().text(items.get(i)).build();
            line.add(button);
            
            if(line.size() == 3 || i + 1 == items.size()){
                rows.add(new KeyboardRow(line));
                line.clear();
            }
        }
        return rows;
    }
}
