package com.LeadToRevenue.ProductCatalogueSystem.controller;

//ProductController.java
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LeadToRevenue.ProductCatalogueSystem.model.Product;
import com.LeadToRevenue.ProductCatalogueSystem.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

 @Autowired
 private ProductService productService;

 @GetMapping
 public List<Product> getAllProducts() {
     return productService.getAllProducts();
 }

 @GetMapping("/{id}")
 public Product getProductById(@PathVariable String id) {
     return productService.getProductById(id);
 }

 @PostMapping
 public Product addProduct(@RequestBody Product product) {
     return productService.addProduct(product);
 }

 @PutMapping("/{id}")
 public Product updateProduct(@PathVariable String id, @RequestBody Product product) {
     return productService.updateProduct(id, product);
 }

 @DeleteMapping("/{id}")
 public String deleteProduct(@PathVariable String id) {
     productService.deleteProduct(id);
     return "Product Deleted Successfully !";
 }
}

