package com.example.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.PricesServiceI;

@RestController
public class PricesController {
	
	@Autowired
	private PricesServiceI pricesServiceI;	
	
	@GetMapping("/get-price/{id}")
	public BigDecimal getPrice(final @PathVariable Integer id) {
		return pricesServiceI.getPrice(id);
	}
	
	@GetMapping("/get-all-prices")
	public List<BigDecimal> getAllPrices(){
		return pricesServiceI.getAllPrices();
		
	}
}
