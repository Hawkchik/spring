package ru.ivan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

       // MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        //musicPlayer.playMusic();
        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);
        context.close();
//        Music music = context.getBean("musicBean", Music.class);

/*        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();
        Music music2 = context.getBean("someClassicalMusic", Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(music2);
musicPlayer1.playMusic();
        context.close();*/

    }
}
