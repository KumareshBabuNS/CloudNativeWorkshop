package io.springbox.catalog.repositories;

import io.springbox.catalog.domain.Genre;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by agnisa on 31.08.2016.
 */
public interface GenreRepository extends CrudRepository<Genre, Long> {
    Genre findByMlId(String mlId);
}
