package com.kosta.musicplayer.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.ClientInfoStatus;
import java.util.List;

@Entity
@Data
public class Genre {
    @Id
    private long id;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String genreName;

    @OneToMany(mappedBy = "genre", fetch = FetchType.LAZY)
    private List<Track> tracks;
}