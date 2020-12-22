package com.example.ensayo.services;
import org.springframework.data.jpa.repository.Query;
import com.example.ensayo.entities.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ensayo.dto.clientesDTO;
import java.util.List;
import org.springframework.stereotype.Repository;

public interface clientesRepositoryInterface extends JpaRepository<Clientes, String> {
	List<Clientes> findByRegionIsNull();
} 