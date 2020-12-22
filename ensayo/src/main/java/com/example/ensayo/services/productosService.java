package com.example.ensayo.services;
import com.example.ensayo.entities.productos;
import com.example.ensayo.services.productosRepositoryInterface;
import com.example.ensayo.services.productosServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class productosService implements productosServiceInterface {
private productosRepositoryInterface cri;
	@Autowired
	public productosService(productosRepositoryInterface cri){
	this.cri = cri;	
	}

	@Override
	public void save(productos dto){
	cri.save(dto);	
	}

	@Override
	public void update(productos dto){
	cri.save(dto);	
	}

	@Override
	public void delete(productos dto){
	cri.delete(dto);	
	}

	@Override
	public List<productos> findAll(){
	return cri.findAll();	
	}
	

	@Override
	public productos findById(Long id){
	return cri.findById(id).orElseThrow(() -> new productosNotFoundException(id));
	}	


}