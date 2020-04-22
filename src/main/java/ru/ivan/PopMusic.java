package ru.ivan;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music {
   ArrayList<String> songs = new ArrayList<String>();
    {
        songs.add("One Pop");
        songs.add("Two Pop");
        songs.add("Three Pop");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
