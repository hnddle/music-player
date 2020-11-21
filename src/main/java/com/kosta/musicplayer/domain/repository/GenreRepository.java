package com.kosta.musicplayer.domain.repository;

import com.kosta.musicplayer.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
