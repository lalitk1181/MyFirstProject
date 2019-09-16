package com.niit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;
import com.niit.service.ProductService;

public class App 
{
	
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		ProductService productService = (ProductService) context.getBean("productService");
		/*List<Product> allProducts = productService.getAllProducts();
		for(Product p:allProducts)
		{
			System.out.println("Name : "+p.getProductName()+" Price : "+p.getPrice());
		}*/
		
		/*Product product = (Product) context.getBean("Product");
		product.setProductName("Skinny Men Blue Jeans");
		product.setCategoryName("Men");
		product.setDescription("Idle for party wear");
		product.setPrice(899);
		product.setQuantity(29);
		product.setSeller("Wrangler");
		product.setImage("img4.jpg");
		boolean result = productService.addProduct(product);
		if(result)
		{
			System.out.println("Product Successfully Added!!");
		}
		else
		{
			System.out.println("Error.. Product Not Inserted");
		}*/
		
		/*Product prod = productService.getProductByID(2);
		System.out.println("Name : "+prod.getProductName()+" Price : "+prod.getPrice());
		
		boolean result = productService.deleteProduct(4);
		if(result)
		{
			System.out.println("Product Successfully Deleted!!");
		}
		else
		{
			System.out.println("Error.. Product Not Deleted");
		} */
    }
}
    