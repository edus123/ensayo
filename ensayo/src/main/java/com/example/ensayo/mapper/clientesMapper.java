package com.example.ensayo.mapper;
import com.example.ensayo.dto.clientesDTO;
import com.example.ensayo.entities.Clientes;

public class clientesMapper {
	private clientesMapper(){}
	public static Clientes toEntity(clientesDTO dto){
	Clientes c  = new Clientes();
	c.setId_cliente(dto.getId_cliente());
	c.setNombre_compania(dto.getNombre_compania());
	c.setNombre_contacto(dto.getNombre_contacto());
	c.setTitulo_contacto(dto.getTitulo_contacto());
	c.setDireccion(dto.getDireccion());
	c.setCiudad(dto.getCiudad());
	c.setRegion(dto.getRegion());
	c.setCodigo_postal(dto.getCodigo_postal());
	c.setPais(dto.getPais());
	c.setTelefono(dto.getTelefono());
	c.setMail(dto.getMail());
	c.setClave(dto.getClave());
	return c;
	}

}