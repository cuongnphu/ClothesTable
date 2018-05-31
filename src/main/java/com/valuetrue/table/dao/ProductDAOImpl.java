package com.valuetrue.table.dao;

import com.valuetrue.table.model.Product;
import com.valuetrue.table.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ProductDAOImpl implements ProductDAO {

    private ProductRepository productRepository;

    // Spring will instance and inject it when declare
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // SAVE a Product
    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    // UPDATE a particular Product
    @Override
    public void updateProduct(Product product) {
        Product prod = productRepository.getOne(product.getId());
        prod.setName(product.getName());
        prod.setQuantity(product.getQuantity());
        prod.setTableId(product.getTableId());
        productRepository.save(prod);
    }

    // DELETE a Product by Id
    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    // GET Product by Id
    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id);
    }

    // GET all Products
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // GET all Products by TableId
    @Override
    public List<Product> getAllProductsByTableId(int table_id) {
        return productRepository.findByTableId(table_id);
    }
}
