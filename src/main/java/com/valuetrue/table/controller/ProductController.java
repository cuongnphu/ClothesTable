package com.valuetrue.table.controller;

import com.valuetrue.table.model.Product;
import com.valuetrue.table.service.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class ProductController {

	private Logger log = Logger.getLogger(ProductController.class);
	private ProductService prodService;

	@Autowired
	public void setProdService(ProductService prodService) {
		this.prodService = prodService;
	}

	@RequestMapping(value = "/edit/product/{table_id}/delete/{id}")
	public ModelAndView deleteProduct(@PathVariable("id") int id, @PathVariable("table_id") int table_id) {
		// Delete a product by parameter Id
		log.info("Delete an product by id = " + id);
		this.prodService.deleteProduct(id);

		// Initialize variable for redirection page
		RedirectView rv = new RedirectView();
		rv.setContextRelative(true);
		rv.setUrl("/edit/" + table_id);

		return new ModelAndView(rv);
	}

	@RequestMapping(value = "/addproduct/{id}", method = RequestMethod.POST)
	public @ResponseBody
    String addProduct(@PathVariable("id") int id) {
		// Create a product with table_id
		Product prod = new Product();
		prod.setTableId(id);
		prod.setName("");
		prod.setQuantity(0);

		// Save product
		this.prodService.saveProduct(prod);

		// Redirect to page
		return "/edit/"+id  ;
	}

}
