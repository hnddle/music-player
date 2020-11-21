package com.kosta.musicplayer.controller;

import com.kosta.musicplayer.domain.Genre;
import com.kosta.musicplayer.domain.Track;
import com.kosta.musicplayer.domain.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/tracks")
public class TrackController {
    /*
    private final TrackRepository trackRepository;

    @Autowired
    public TrackController(TrackRepository trackRepository){
        this.trackRepository = trackRepository;
    }

    @GetMapping
    private List<Track> getTracks() {
        return trackRepository.findAll();
    }

    @PostMapping
    private Track postGenre(@RequestBody Track track){
        return trackRepository.save(track);
    }

    @PutMapping("/{id}")
    private Track updateGenre(@PathVariable("id") long id, @RequestBody Track track){
        Track result = trackRepository.findById(id).get();
        result.setTitle(track.getTitle());
        return trackRepository.save(result);
    }

    @DeleteMapping
    private void deleteGenre(@PathVariable("id") long id){
        trackRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    private Track getGenre(@PathVariable("id") long id){
        return trackRepository.findById(id).get();
    }*/
}
