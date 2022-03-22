package com.example.demo.dummy;



public class DummyemailRepo implements EmailRepositroy {

	@Override
	public String sendMessage(String message) {
		
		throw new AssertionError("Un Implemented");
	}

}
