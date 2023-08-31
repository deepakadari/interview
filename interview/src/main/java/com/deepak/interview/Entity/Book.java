package com.deepak.interview.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	private String name;
	@Id
	private int id;
	private String author;
	public Book(String name, int id, String author) {
		super();
		this.name = name;
		this.id = id;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + ", author=" + author + "]";
	}
	
	 
}
