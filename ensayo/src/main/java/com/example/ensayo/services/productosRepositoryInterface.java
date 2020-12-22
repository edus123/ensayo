package com.example.ensayo.services;
import com.example.ensayo.entities.productos;
import org.springframework.data.jpa.repository.JpaRepository;
public interface productosRepositoryInterface extends JpaRepository<productos, Long> {

} 