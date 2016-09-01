package io.springbox.catalog.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Created by agnisa on 31.08.2016.
 */
@Entity
@Data
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String mlId;

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "genres")
    @JsonIgnore
    private List<Movie> movies;
}
