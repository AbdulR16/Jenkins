package com.example.demo;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;




import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

public class BookServiceHamcrestService {
	
	@DisplayName("Test Book Class has a Property Author")
	@Test
	void testBookHasAuthoProp() {
		
		Book book = new Book();
		
		assertThat(book, hasProperty("author"));
		
		
	}
	
	@DisplayName(value ="getBook Method in BookService should return a book"
			+"with price less than 100 for book with id 101")
	@Test
	void testPriceOfFirstBook() {
		
		
		BookService service = new BookService();
		
		assertThat(service.getBook(2).getPrice(),is(lessThan(100.00)));
		
	}

}
