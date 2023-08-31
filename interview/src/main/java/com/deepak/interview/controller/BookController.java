package com.deepak.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.interview.Entity.Book;
import com.deepak.interview.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookservice;

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Book> getallList() {
		return bookservice.showallbooks();

	}

}
