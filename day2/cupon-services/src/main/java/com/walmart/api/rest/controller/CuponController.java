package com.walmart.api.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.api.cupon.model.Cupon;
import com.walmart.api.cupon.repository.CuponRepository;

@RestController
@RequestMapping("/api/cupon")
public class CuponController {
	
	@Autowired
	private CuponRepository repository;

	@GetMapping("/{id}")
	public Cupon findByID(@PathVariable("id") String id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public Cupon save(@RequestBody Cupon cupon) {
		return repository.save(cupon);
	}
	
	@GetMapping
	public List<Cupon> findAll() {
		return repository.findAll();
	}
}
