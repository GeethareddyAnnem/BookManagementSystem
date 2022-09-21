package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Book;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookManagementSystemApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void selectBook() {
		RestTemplate temp = new RestTemplate();
		List<Book> books = (List<Book>) temp.getForObject("http://localhost:8080/Book",List.class);
		System.out.println("book"+ books);
		assertNotNull(books);
		
	}
	
	

}
