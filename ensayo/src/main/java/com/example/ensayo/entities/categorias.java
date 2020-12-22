package com.example.ensayo.entities;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import com.example.ensayo.dto.categoriasDTO;

@Getter
@Setter
@Entity
public class categorias {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_categoria", nullable = false)
private Long id_categoria;
String nombre_categoria;
String descripcion;


public categoriasDTO toDTO(){
categoriasDTO dto = new categoriasDTO();
dto.setId_categoria(this.getId_categoria());
dto.setNombre_categoria(this.getNombre_categoria());
dto.setDescripcion(this.getDescripcion());
return dto;
}
} 