package com.example.ktraspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level =  AccessLevel.PRIVATE)
public class Product {
    int id;
    @JsonProperty("nameProduct")
    String name;
    String description;
    @JsonProperty("thumbnail")
    String thumbnail;
    Integer price;
    double rating;
    Integer priceDiscount;
    @JsonProperty("review")
    List<Review> reviews;
}
