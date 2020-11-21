package com.kosta.musicplayer.service;

import com.kosta.musicplayer.domain.Artist;
import com.kosta.musicplayer.domain.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    @Autowired
    public ArtistServiceImpl(ArtistRepository artistRepository){
        this.artistRepository = artistRepository;
    }
/*
    @Override
    public List<Artist> getArtists(){
        return artistRepository.findAll();
    }*/

}
