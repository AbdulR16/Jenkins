package com.example.demo;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


import java.awt.print.Book;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BookServiceHamcrestService {
	
	@DisplayName("Test Book Class has a Property Author")
	@Test
	void testBookHasAuthoProp() {
		
		Book book = new Book();
		
		assertThat(book, hasProperty("author"));
		
		
	}

}
