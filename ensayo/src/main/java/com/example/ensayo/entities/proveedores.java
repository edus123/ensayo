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
@Table(name = "proveedores")
public class proveedores {
@Id
@Column(name = "id_proveedor", nullable = false)
private Long id_proveedor;
String nombre_compania;
String nombre_contacto;
String titulo_contacto;
String direccion;
String ciudad;
String region;
String codigo_postal;
String pais;
String telefono;
} 