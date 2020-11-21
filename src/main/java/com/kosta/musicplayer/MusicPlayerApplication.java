package com.kosta.musicplayer;

import com.kosta.musicplayer.domain.Track;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicPlayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicPlayerApplication.class, args);

        Track a = new Track();
    }

}
