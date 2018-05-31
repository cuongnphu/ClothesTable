package com.valuetrue.table.dao;


import com.valuetrue.table.model.Product;
import java.util.List;




public interface ProductDAO {

    public void saveProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProduct(int id);
    public Product getProductById(int id);
    public List<Product> getAllProducts();
    public List<Product> getAllProductsByTableId(int table_id);

}
