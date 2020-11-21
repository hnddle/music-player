package com.kosta.musicplayer.domain.repository;

import com.kosta.musicplayer.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends JpaRepository<Track, Long> {

}
