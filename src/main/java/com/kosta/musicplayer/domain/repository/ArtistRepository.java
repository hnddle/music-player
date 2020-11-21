package com.kosta.musicplayer.domain.repository;

import com.kosta.musicplayer.domain.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
    List<Artist> findByName(String name);

    // @Query("SELECT a from Artist a WHERE a.name = ?1")
    @Query("SELECT a from Artist a WHERE a.name = :name")
    List<Artist> findmmmm(String name);

    //@Query(value = "sfafs", nativeQuery = true)
}
