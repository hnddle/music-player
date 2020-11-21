package com.kosta.musicplayer.domain;

import lombok.Data;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Album {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String date;

    @OneToMany(mappedBy = "album", fetch = FetchType.LAZY)
    private List<Track> tracks;

    @ManyToOne
    @JoinColumn(name = "ARTIST_ID")
    private Artist artist;
}
