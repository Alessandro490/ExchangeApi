package com.exchange.rodriguezvillalta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.exchange.rodriguezvillalta.model.entities.Product;
import com.exchange.rodriguezvillalta.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
		
		@Autowired
		ProductService productService;
		
		@GetMapping()
		public List<Product> showActivities() {
			return productService.getAllProducts();
		}
		
		@GetMapping("/{id}")
	    public Product getProduct (@PathVariable Integer id) {
	        Product act = productService.getProductById(id);
	        return act;
	    }
		
		@ResponseStatus(HttpStatus.CREATED)
		@PostMapping()
		public Product createProduct(@RequestBody Product product) {
	        return productService.createProduct(product);
	    }
		
		@PutMapping()
	    public Product updateProduct(@RequestBody Product product) {
	        return productService.updateProduct(product);
	    }
		
		@DeleteMapping(value = "{id}")
	    public @ResponseBody String deleteProduct(@PathVariable("id")  Integer id ) {
	         productService.deleteProduct(id);
	         return null;
	     }
}
