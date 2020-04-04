package com.sjs.product.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/product")
public class ProductListercontroller {

	@GetMapping("/getAllProduct")
	public List getAllProduct() {
		
		return null;
		
	}
	
}
