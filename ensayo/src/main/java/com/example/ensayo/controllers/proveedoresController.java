package com.example.ensayo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.ensayo.services.proveedoresServiceInterface;
import com.example.ensayo.entities.proveedores;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList; 
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class proveedoresController {

	private proveedoresServiceInterface csi;
	
	@Autowired
	public proveedoresController(proveedoresServiceInterface csi2){
	this.csi = csi2;
	}

	@GetMapping("/proveedores")
	@ResponseStatus(HttpStatus.OK)
	public List<proveedores> findAll(){
	return csi.findAll();    
	}

	@GetMapping("/proveedores/{id}")
	@ResponseStatus(HttpStatus.OK)
	public proveedores findById(@PathVariable Long id){
	return csi.findById(id);    
	}

	@PostMapping("/proveedores")
	@ResponseStatus(HttpStatus.CREATED)
        void newProvider(@RequestBody proveedores proveedor) {
    	csi.save(proveedor);
  }
	
}





