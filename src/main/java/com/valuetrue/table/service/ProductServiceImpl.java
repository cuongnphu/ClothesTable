package com.valuetrue.table.service;

import com.valuetrue.table.dao.ProductDAO;
import com.valuetrue.table.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService{
	
	private ProductDAO prodDAO;

	@Autowired
	public void setProdDAO(ProductDAO prodDAO) {
		this.prodDAO = prodDAO;
	}

	@Override
	public void saveProduct(Product product) {
		if(product.getName()!= "" && product.getQuantity() != null && product.getQuantity()> 0)
			this.prodDAO.saveProduct(product);
	}

	@Override
	public void updateProduct(Product product) {
		if(product.getName()!= "" && product.getQuantity() != null && product.getQuantity() > 0)
			this.prodDAO.updateProduct(product);
		
	}

	@Override
	public void deleteProduct(int id) {
		this.prodDAO.deleteProduct(id);
		
	}

	@Override
	public Product getProductById(int id) {
		if(id != 0)
			return this.prodDAO.getProductById(id);
		else
			return this.prodDAO.getProductById(0);
	}

	@Override
	public List<Product> getAllProducts() {
		return this.prodDAO.getAllProducts();
	}

	@Override
	public List<Product> getAllProductsByTableId(int table_id) {
		return this.prodDAO.getAllProductsByTableId(table_id);
	}

}
