package com.example.demo.controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class IdNotFoundExeption extends RuntimeException {

private String message;

@Override
public String getMessage() {
return message.toUpperCase();
}


}