package com.example.ensayo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.ensayo.services.clientesServiceInterface;
import com.example.ensayo.dto.clientesDTO;
import com.example.ensayo.entities.Clientes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList; 
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class clientesController {

	private clientesServiceInterface csi;
	
	@Autowired
	public clientesController(clientesServiceInterface csi2){
	this.csi = csi2;
	}

	@GetMapping("/clientes")
	@ResponseStatus(HttpStatus.OK)
	public List<Clientes> findAll(){
	return csi.findAll();    
	}

	@GetMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Clientes findById(@PathVariable String id){
	return csi.findById(id);    
	}

	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
        void newClient(@RequestBody Clientes cliente) {
    	csi.save(cliente);
  }
	
}













