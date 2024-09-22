package com.ramendu.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramendu.backend.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
