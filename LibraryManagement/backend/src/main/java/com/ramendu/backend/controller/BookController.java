package com.ramendu.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import com.ramendu.backend.entity.Book;
import com.ramendu.backend.service.BookServices;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BookController {

    @Autowired
    private BookServices services;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return services.saveBook(book);
    }

    @GetMapping("/getBook")
    public List<Book> getBooks() {
        return services.getBooks();
    }

    @GetMapping("/getBook/{id}")
    public Book getBook(@PathVariable int id) {
        return services.getBook(id);
    }

    @PutMapping("/updateBook/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        return services.updateBook(id, book);
    }

    @DeleteMapping("/deleteBook/{id}")
    public void deleteBook(@PathVariable int id) {
        services.deleteBook(id);
    }
}
