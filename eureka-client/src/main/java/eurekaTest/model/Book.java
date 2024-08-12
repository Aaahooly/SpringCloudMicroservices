package eurekaTest.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Document(collection = "book")
public class Book {

//    @Id
    private String id;

    private String title;

    private String description;

    private String imageLink;

    public Book(String title, String description, String imageLink) {
        this.title = title;
        this.description = description;
        this.imageLink = imageLink;
    }
}
