package com.example.bookservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "book")
public class Book {

    @Id
    private UUID id;

    private String title;

    private String description;

    private String imageLink;

    public Book(String title, String description, String imageLink) {
        this.title = title;
        this.description = description;
        this.imageLink = imageLink;
    }
}
