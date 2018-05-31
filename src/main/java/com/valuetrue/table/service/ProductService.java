package com.valuetrue.table.service;

import com.valuetrue.table.model.Product;

import java.util.List;


public interface ProductService {
	
	public void saveProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(int id);
	public Product getProductById(int id);
	public List<Product> getAllProducts();
	public List<Product> getAllProductsByTableId(int table_id);

}
