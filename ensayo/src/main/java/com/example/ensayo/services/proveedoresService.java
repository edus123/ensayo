package com.example.ensayo.services;
import com.example.ensayo.entities.proveedores;
import com.example.ensayo.services.proveedoresRepositoryInterface;
import com.example.ensayo.services.proveedoresServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class proveedoresService implements proveedoresServiceInterface {
private proveedoresRepositoryInterface cri;
	@Autowired
	public proveedoresService(proveedoresRepositoryInterface cri){
	this.cri = cri;	
	}

	@Override
	public void save (proveedores dto){
	cri.save(dto);	
	}

	@Override
	public void update(proveedores dto){
	cri.save(dto);	
	}

	@Override
	public void delete(proveedores dto){
	cri.delete(dto);	
	}

	@Override
	public List<proveedores> findAll(){
	return cri.findAll();	
	}

	@Override
	public proveedores findById(Long id){
	return cri.findById(id).orElse(new proveedores());	
	}

}