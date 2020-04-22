package ru.ivan;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    ArrayList<String> songs = new ArrayList<String>();
    {
        songs.add("One Classic");
        songs.add("Two Classic");
        songs.add("Three Classic");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}

