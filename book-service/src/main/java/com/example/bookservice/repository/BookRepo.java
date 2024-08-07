package com.example.bookservice.repository;

import com.example.bookservice.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BookRepo extends MongoRepository<Book, UUID> {

    @Override
    List<Book> findAll();
}
