package com.kosta.musicplayer.domain;

import lombok.Data;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Album {
    @Id
    private long id;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String albumTitle;
    private String date;

    @OneToMany(mappedBy = "album", fetch = FetchType.LAZY)
    private List<Track> tracks;

    @ManyToOne
    @JoinColumn(name = "ARTIST_ID")
    private Artist artist;
}
