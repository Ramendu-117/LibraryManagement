package com.ramendu.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.ramendu.backend.entity.Book;
import com.ramendu.backend.repository.BookRepo;

@Service
public class BookServices {

    @Autowired
    private BookRepo repo;

    // POST Req
    public Book saveBook(Book book) {
        return repo.save(book);
    }

    public List<Book> saveBooks(List<Book> books) {
        return repo.saveAll(books);
    }

    // GET Req
    public Book getBook(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<Book> getBooks() {
        return repo.findAll();
    }

    // DELETE Req
    public void deleteBook(int id) {
        repo.deleteById(id);
        System.out.println(id + ": Got deleted");
    }

    // PUT Req
    public Book updateBook(int id, Book book) {
        Book existingBook = repo.findById(id).orElse(null);
        existingBook.setBookName(book.getBookName());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setYear(book.getYear());
        existingBook.setAvailability(book.getAvailability());
        return repo.save(existingBook);
    }

}
