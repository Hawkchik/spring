package ru.ivan;

import org.springframework.stereotype.Component;

@Component("someClassicalMusic")
public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
