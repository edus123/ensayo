package com.example.ensayo.services;
import com.example.ensayo.entities.productos;
import java.util.List;
public interface productosServiceInterface {
void save(productos dto);
void update(productos dto);
List<productos> findAll();
productos findById(Long id);
void delete(productos dto);
}
