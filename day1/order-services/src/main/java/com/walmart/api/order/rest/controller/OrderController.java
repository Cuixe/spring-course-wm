package com.walmart.api.order.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.api.order.entry.Order;
import com.walmart.api.order.feing.client.CouponServiceFeingCient;
import com.walmart.api.order.repository.OrderRepository;

@RestController
@RequestMapping
public class OrderController {
	
	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private CouponServiceFeingCient couponServiceFeingCient;

	@GetMapping("/api/order/{id}")
	public Order findByID(@PathVariable("id") String id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/api/order")
	public Order save(@RequestBody Order order) {
		//fetch cuponCode from order object 
		String cuponCode = order.getCouponCode();
		//base on cuponCode fetch discount from coupon service application
		//this must to be a rest call to coupon service
		int discount = couponServiceFeingCient.getCouponCode(cuponCode).getDiscount();
		//Apply the discount to order object
		order.setPrice(order.getPrice() - discount);
		//Save order object in the data base
		return repository.save(order);
	}
	
	@GetMapping("/api/order")
	public List<Order> findAll() {
		return repository.findAll();
	}
	
}
