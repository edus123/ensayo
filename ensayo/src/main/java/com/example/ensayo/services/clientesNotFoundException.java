package com.example.ensayo.services;

class clientesNotFoundException extends RuntimeException {

  clientesNotFoundException(String id) {
    super("Could not find employee " + id);
  }
}