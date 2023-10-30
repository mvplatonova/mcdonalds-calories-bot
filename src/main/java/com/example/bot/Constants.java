package com.example.bot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.springframework.core.io.ClassPathResource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Constants {
    public static final String BOT_NAME = "BestMcDonaldsCaloriesBot";
    public static final String TOKEN;

    static {
        TOKEN = readToken();
    }

    private static String readToken() {
        try {
            File resource = new ClassPathResource(".token").getFile();
            return Files.readString(resource.toPath());
        } catch (IOException e) {
            log.error("Error while reading token", e);
        }
        return "";
    }
}
