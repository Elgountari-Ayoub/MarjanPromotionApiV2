package com.example.marjanpromotionapiv2test.Helpers;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class Generate {
    private final Random random = new Random();
    private final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    @Bean
    public String generateStringId(){
        int length = 16 ;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();

    }
}
