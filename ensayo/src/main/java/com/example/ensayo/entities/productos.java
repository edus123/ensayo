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
@Table(name = "productos")
public class productos {
@Id
@Column(name = "id_producto", nullable = false)
private Long id_producto;
String nombre_producto;
Long  id_proveedor;
Long id_categoria;
String cantidad_por_unidad;
double  precio_unitario;
int  unidades_en_stock;
boolean  discontinuado;
} 