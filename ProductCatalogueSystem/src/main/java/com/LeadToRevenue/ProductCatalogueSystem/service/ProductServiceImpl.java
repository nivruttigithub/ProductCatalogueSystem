package com.LeadToRevenue.ProductCatalogueSystem.service;

//ProductServiceImpl.java

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LeadToRevenue.ProductCatalogueSystem.model.Product;
import com.LeadToRevenue.ProductCatalogueSystem.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

 @Autowired
 private ProductRepository productRepository;

 @Override
 public List<Product> getAllProducts() {
     return productRepository.findAll();
 }

 @Override
 public Product getProductById(String id) {
     return productRepository.findById(id).orElse(null);
 }

 @Override
 public Product addProduct(Product product) {
     return productRepository.save(product);
 }

 @Override
 public Product updateProduct(String id, Product product) {
     if (productRepository.existsById(id)) {
         product.setId(id);
         return productRepository.save(product);
     }
     return null;
 }

 @Override
 public void deleteProduct(String id) {
     productRepository.deleteById(id);
 }
}
