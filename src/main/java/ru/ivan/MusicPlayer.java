package ru.ivan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2,
                       @Qualifier("popMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    // IoC

/*
    public MusicPlayer(Music music) {
        this.music = music;
    }
*/
Random random = new Random();
int randomNumber =random.nextInt(3);

    public String playMusic(TypeOfMusic typeOfMusic) {
        if (typeOfMusic == TypeOfMusic.CLASSICAL) {
            return "Playing: " + music2.getSongs().get(randomNumber);
        } else if (typeOfMusic == TypeOfMusic.ROCK) {
            return "Playing " + music1.getSongs().get(randomNumber);
        } else {
            return "Playing " + music3.getSongs().get(randomNumber);
        }

    }
}
