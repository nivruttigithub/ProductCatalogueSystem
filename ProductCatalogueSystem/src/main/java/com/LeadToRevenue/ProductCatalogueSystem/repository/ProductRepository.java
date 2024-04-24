package com.LeadToRevenue.ProductCatalogueSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.LeadToRevenue.ProductCatalogueSystem.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
