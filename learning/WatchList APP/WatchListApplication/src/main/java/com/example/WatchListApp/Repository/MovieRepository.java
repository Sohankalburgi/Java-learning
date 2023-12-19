package com.example.WatchListApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WatchListApp.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
