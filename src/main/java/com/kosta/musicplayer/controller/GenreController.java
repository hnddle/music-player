package com.kosta.musicplayer.controller;

import com.kosta.musicplayer.domain.Genre;
import com.kosta.musicplayer.domain.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenreController {
    private final GenreRepository genreRepository;

    @Autowired
    public GenreController(GenreRepository genreRepository){
        this.genreRepository = genreRepository;
    }

    @GetMapping
    private List<Genre> getGenres() {
        return genreRepository.findAll();
    }

    @PostMapping
    private Genre postGenre(@RequestBody Genre genre){
        return genreRepository.save(genre);
    }

    @PutMapping("/{id}")
    private Genre updateGenre(@PathVariable("id") long id, @RequestBody Genre genre){
        Genre result = genreRepository.findById(id).get();
        result.setName(genre.getName());
        return genreRepository.save(result);
    }

    @DeleteMapping
    private void deleteGenre(@PathVariable("id") long id){
        genreRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    private Genre getGenre(@PathVariable("id") long id){
        return genreRepository.findById(id).get();
    }
}

