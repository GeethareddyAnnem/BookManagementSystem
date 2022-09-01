package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
@Service
public interface BookService {

	Book createBook(Book b);

    List<Book> getallList();

	void deleteBook(Integer id);

	Book updateBook(int id, Book b);
	
	

}
