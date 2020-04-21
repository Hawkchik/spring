package ru.ivan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();
        Music music2 = context.getBean("someClassicalMusic", Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(music2);
musicPlayer1.playMusic();
        context.close();

    }
}
