package com.example.ensayo.services;
import com.example.ensayo.dto.clientesDTO;
import com.example.ensayo.entities.Clientes;
import java.util.List;
public interface clientesServiceInterface {
void save(Clientes dto);
void update(clientesDTO dto);
List<Clientes> findAll();
List<Clientes> findAllClientes();
Clientes findById(String id);
void delete(clientesDTO dto);
}
