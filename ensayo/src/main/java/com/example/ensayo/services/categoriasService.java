package com.example.ensayo.services;
import com.example.ensayo.dto.categoriasDTO;
import com.example.ensayo.entities.categorias;
import com.example.ensayo.services.categoriasRepositoryInterface;
import com.example.ensayo.services.categoriasServiceInterface;
import com.example.ensayo.mapper.categoriasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class categoriasService implements categoriasServiceInterface {
private categoriasRepositoryInterface cri;
	@Autowired
	public categoriasService(categoriasRepositoryInterface cri){
	this.cri = cri;	
	}

	@Override
	public void save (categoriasDTO dto){
	cri.save(categoriasMapper.toEntity(dto));	
	}

	@Override
	public void update(categoriasDTO dto){
	cri.save(categoriasMapper.toEntity(dto));	
	}

	@Override
	public void delete(categoriasDTO dto){
	cri.delete(categoriasMapper.toEntity(dto));	
	}

	@Override
	public List<categoriasDTO> findAll(){
	return cri.findAll().stream().map(categorias::toDTO).collect(Collectors.toList());	
	}

	@Override
	public categoriasDTO findById(Long id){
	return cri.findById(id).orElse(new categorias()).toDTO();	
	}

}