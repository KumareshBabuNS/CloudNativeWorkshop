package io.springbox.catalog.repositories;

import io.springbox.catalog.domain.Movie;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by agnisa on 31.08.2016.
 */
public interface MovieRepository extends CrudRepository<Movie, Long> {
    public Movie findByMlId(String mlId);
}
