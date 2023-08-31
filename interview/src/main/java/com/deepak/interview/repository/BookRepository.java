package com.deepak.interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.interview.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
