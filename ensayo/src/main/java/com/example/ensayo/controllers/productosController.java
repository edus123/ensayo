package com.example.ensayo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.ensayo.services.productosServiceInterface;
import com.example.ensayo.entities.productos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList; 
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class productosController {

	private productosServiceInterface csi;
	
	@Autowired
	public productosController(productosServiceInterface csi2){
	this.csi = csi2;
	}

	@GetMapping("/productos")
	@ResponseStatus(HttpStatus.OK)
	public List<productos> findAll(){
	return csi.findAll();    
	}

	@GetMapping("/productos/{id}")
	@ResponseStatus(HttpStatus.OK)
	public productos findById(@PathVariable Long id){
	return csi.findById(id);    
	}

	@PostMapping("/productos")
	@ResponseStatus(HttpStatus.CREATED)
        void newProvider(@RequestBody productos proveedor) {
    	csi.save(proveedor);
  }
	
}



