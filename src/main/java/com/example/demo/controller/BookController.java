package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;


@RestController
public class BookController {
private BookService bs;

public BookController(BookService bs) {
    this.bs = bs;
}
@PostMapping("/Book")
public String createBook(@RequestBody Book b){
    bs.createBook(b);
    return " book is saved";
    
}
@GetMapping(value="/Book")
public List<Book> getAllBook() {
    return bs.getallList();
}
@DeleteMapping("/Book/{id}")
public String deleteBook(@PathVariable("id") int id){
    bs.deleteBook(id);


    return  "book of "+id+"deleted sucessfully..";

    
}
@PutMapping("/Book/{id}")
public Book updateBook(@PathVariable("id") int id, @RequestBody Book b){
    return bs.updateBook(id,b);
}

}
