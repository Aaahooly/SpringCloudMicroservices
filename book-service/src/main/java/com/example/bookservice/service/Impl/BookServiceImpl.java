package com.example.bookservice.service.Impl;

import com.example.bookservice.model.Book;
import com.example.bookservice.repository.BookRepo;
import com.example.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private final BookRepo bookRepo;

    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public List<Book> findAll() {
       return bookRepo.findAll();
    }

    public void saveBook(Book book){
        bookRepo.save(book);
    }
}
