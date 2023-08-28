package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Books;

public interface BooksRepo extends JpaRepository<Books, Integer> {

}