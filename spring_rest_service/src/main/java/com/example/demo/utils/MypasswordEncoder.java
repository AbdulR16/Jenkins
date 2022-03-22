package com.example.demo.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MypasswordEncoder {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		System.out.println(encoder.encode(args[0]));

	}

}

//$2a$10$EMecUXmzehwNlCsYZMBJZe30iFgNnZDGIu3EniXx8ZmEsOO1.V5zy - bhutan

//$2a$10$JaVNfhbPWZxvXZSflDYSje/YnRK3d3EGIzMhHH5eVNUM2pu2qBQwO - srilanka