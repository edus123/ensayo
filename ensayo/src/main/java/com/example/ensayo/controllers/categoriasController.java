package com.example.ensayo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.ensayo.services.categoriasServiceInterface;
import com.example.ensayo.dto.categoriasDTO;

@RestController
public class categoriasController {
	private categoriasServiceInterface csi;
	@Autowired
	public categoriasController(categoriasServiceInterface csi2){
	this.csi = csi2;
	}

	@GetMapping("/categorias")
	@ResponseStatus(HttpStatus.OK)
	public List<categoriasDTO>findAll() {
	return csi.findAll();    
	}

}











