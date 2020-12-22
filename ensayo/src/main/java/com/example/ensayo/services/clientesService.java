package com.example.ensayo.services;
import com.example.ensayo.dto.clientesDTO;
import com.example.ensayo.entities.Clientes;
import com.example.ensayo.services.clientesRepositoryInterface;
import com.example.ensayo.services.clientesServiceInterface;
import com.example.ensayo.mapper.clientesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class clientesService implements clientesServiceInterface {
private clientesRepositoryInterface cri;
	@Autowired
	public clientesService(clientesRepositoryInterface cri){
	this.cri = cri;	
	}

	@Override
	public void save(Clientes dto){
	cri.save(dto);	
	}

	@Override
	public void update(clientesDTO dto){
	cri.save(clientesMapper.toEntity(dto));	
	}

	@Override
	public void delete(clientesDTO dto){
	cri.delete(clientesMapper.toEntity(dto));	
	}

	@Override
	public List<Clientes> findAll(){
	return cri.findAll();	
	}
	
	@Override
	public List<Clientes> findAllClientes(){
	return cri.findByRegionIsNull();	
	}
	

	@Override
	public Clientes findById(String id){
	return cri.findById(id).orElseThrow(() -> new clientesNotFoundException(id));
	}	


}