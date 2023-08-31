package com.deepak.interview.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.deepak.interview.Entity.Book;

@Service
public class BookService {
	public List<Book> books = new ArrayList<>();
	
	public List<Book> showallbooks(){
	
	books.add(new Book("Deepak", 1, "ABC"));
	books.add(new Book("abc",2,"xyz"));
	
	return books;
	
	}
	
}
