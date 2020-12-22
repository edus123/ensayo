package com.example.ensayo.entities;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import com.example.ensayo.dto.clientesDTO;
import javax.persistence.Column;
import javax.persistence.Table;
@Getter
@Setter
@Entity
@Table(name = "Clientes")
public class Clientes {
@Id
@Column(name = "id_cliente", nullable = false)
private String id_cliente;
String nombre_compania;
String nombre_contacto;
String titulo_contacto;
String direccion;
String ciudad;
String region;
String codigo_postal;
String pais;
String telefono;
String mail;
String clave;

public clientesDTO toDTO(){
	clientesDTO dto = new clientesDTO();
	dto.setId_cliente(this.getId_cliente());
	dto.setNombre_compania(this.getNombre_compania());
	dto.setNombre_contacto(this.getNombre_contacto());
	dto.setTitulo_contacto(this.getTitulo_contacto());
	dto.setDireccion(this.getDireccion());
	dto.setCiudad(this.getCiudad());
	dto.setRegion(this.getRegion());
	dto.setCodigo_postal(this.getCodigo_postal());
	dto.setPais(this.getPais());
	dto.setTelefono(this.getTelefono());
	dto.setMail(this.getMail());
	dto.setClave(this.getClave());
	return dto;
	}
} 