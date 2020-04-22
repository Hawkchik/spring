package ru.ivan;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    ArrayList<String> songs = new ArrayList<String>();
    {
        songs.add("One Rock");
        songs.add("Two Rock");
        songs.add("Three Rock");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
