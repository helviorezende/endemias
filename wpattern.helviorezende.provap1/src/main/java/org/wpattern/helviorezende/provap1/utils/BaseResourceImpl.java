package org.wpattern.helviorezende.provap1.utils;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public abstract class BaseResourceImpl<T extends BaseEntity<K>, K extends Serializable> {
	
	@Autowired
	private JpaRepository<T, K> repository;
	
	@GetMapping
	public List<T> findAll(){
		return repository.findAll();
	}
	@PostMapping
	public T add(@RequestBody T entityObject){
		return repository.save(entityObject);
	}

}
