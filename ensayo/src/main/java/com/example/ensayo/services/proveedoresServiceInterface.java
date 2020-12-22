package com.example.ensayo.services;
import com.example.ensayo.entities.proveedores;
import java.util.List;
public interface proveedoresServiceInterface {
void save(proveedores dto);
void update(proveedores dto);
List<proveedores> findAll();
proveedores findById(Long id);
void delete(proveedores dto);
}
