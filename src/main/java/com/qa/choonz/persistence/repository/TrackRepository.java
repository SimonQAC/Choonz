package com.qa.choonz.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.choonz.persistence.domain.Track;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track, Long> {

}
