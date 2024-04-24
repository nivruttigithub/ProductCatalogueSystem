package com.LeadToRevenue.ProductCatalogueSystem.service;

import java.util.List;

import com.LeadToRevenue.ProductCatalogueSystem.model.Product;

public interface ProductService {
	List<Product> getAllProducts();

	Product getProductById(String id);

	Product addProduct(Product product);

	Product updateProduct(String id, Product product);

	void deleteProduct(String id);
}