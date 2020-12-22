package com.example.ensayo.mapper;
import com.example.ensayo.dto.categoriasDTO;
import com.example.ensayo.entities.categorias;

public class categoriasMapper {
	private categoriasMapper(){}
	public static categorias toEntity(categoriasDTO dto){
	categorias c  = new categorias();
	c.setId_categoria(dto.getId_categoria());
	c.setNombre_categoria(dto.getNombre_categoria());
	c.setDescripcion(dto.getDescripcion());
	return c;
	}

}