package com.example.ensayo.services;
import com.example.ensayo.dto.categoriasDTO;
import java.util.List;
public interface categoriasServiceInterface {
void save(categoriasDTO dto);
void update(categoriasDTO dto);
List<categoriasDTO> findAll();
categoriasDTO findById(Long id);
void delete(categoriasDTO dto);
}
