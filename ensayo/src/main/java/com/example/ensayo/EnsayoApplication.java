package com.example.ensayo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import com.example.ensayo.entities.Clientes;
import com.example.ensayo.services.clientesService;
import com.example.ensayo.services.clientesServiceInterface;
import com.example.ensayo.services.clientesRepositoryInterface;
import org.springframework.data.jpa.repository.Query;
import com.example.ensayo.entities.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ensayo.dto.clientesDTO;

@SpringBootApplication
public class EnsayoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnsayoApplication.class, args);
	}

}
