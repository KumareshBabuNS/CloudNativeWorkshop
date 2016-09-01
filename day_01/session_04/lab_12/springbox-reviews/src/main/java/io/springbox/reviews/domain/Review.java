package io.springbox.reviews.domain;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * Created by agnisa on 31.08.2016.
 */
@Data
public class Review {

    @Id
    private String id;

    @Indexed
    private String mlId;

    @Indexed
    private String userName;

    private String title;

    private String review;

    private int rating;

}
