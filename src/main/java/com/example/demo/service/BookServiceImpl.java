package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService {

    private BookRepository br;
    public BookServiceImpl(BookRepository br) {
        this.br = br;
    }


    @Override
    public Book createBook(Book b) {
        // TODO Auto-generated method stub
        return br.save(b);
    }


    @Override
    public List<Book> getallList() {
        // TODO Auto-generated method stub
        return br.findAll();
    }


    @Override
    public void deleteBook(Integer id) {
        // TODO Auto-generated method stub

         br.deleteById(id);
        
    }


    @Override
    public Book updateBook(int id, Book b) {
        // TODO Auto-generated method stub


        Book bookdb = br.findById(id).get();
        bookdb.setAuthor(b.getAuthor());
        bookdb.setName(b.getName());
        bookdb.setPublisher(b.getPublisher());
        bookdb.setId(b.getId());
        br.deleteById(id);
        return br.save(bookdb);

        }



    
    }

   
    

