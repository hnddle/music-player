package com.kosta.musicplayer.controller;

import com.kosta.musicplayer.domain.Artist;
import com.kosta.musicplayer.domain.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArtistController {
    /*
    private final ArtistRepository artistRepository;

    @Autowired
    public ArtistController(ArtistRepository artistRepository)
    {
        this.artistRepository = artistRepository;
    }

    @GetMapping
    public List<Artist> getArtists(@RequestParam(required = false) String name){
        //DB에서 아티스트 정보를 받아와야 함
        // 1. DB에 접속
        // 2. 정보를 받아야 함
        if(name == null){
            return artistRepository.findAll();
        }
        return artistRepository.findByName(name);
    }

    @PostMapping
    public Artist postArtist(@RequestBody Artist artist){
        return artistRepository.save(artist);
    }

    @PutMapping("/{id}")
    public Artist updateArtist(@PathVariable("id") long id, @RequestBody Artist artist){
        Artist result = artistRepository.findById(id).get();
        result.setName(artist.getName());
        result.setAge(artist.getAge());
        return artistRepository.save(result);
    }

    @DeleteMapping("/{id}")
    public void deleteArtist(@PathVariable("id") long id){
        artistRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Artist getArtist(@PathVariable long id) {
        return artistRepository.findById(id).get();
    }*/

}
