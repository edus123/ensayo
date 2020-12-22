package com.example.ensayo.services;

class productosNotFoundException extends RuntimeException {

  productosNotFoundException(Long id) {
    super("No se encontró el producto " + id);
  }
}