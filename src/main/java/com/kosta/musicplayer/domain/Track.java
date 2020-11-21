package com.kosta.musicplayer.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Track {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String title;
    private float rating;
    private int len;
    private int count;
    @ManyToOne
    @JoinColumn(name = "ALBUM_ID")
    private Album album;
    @ManyToOne
    @JoinColumn(name = "GENRE_ID")
    private Genre genre;
}
