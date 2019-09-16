package com.niit;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.model.Product;
import com.niit.service.ProductService;

public class ProductTest {
	private ProductService productService;
	private Product product;
	@Before
	public void setUp() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		productService = (ProductService) context.getBean("productService");
		 product = (Product) context.getBean("Product");
	}
	@Test
	public void getAllProductsTest() {
		List<Product> allProducts = productService.getAllProducts();
		for(Product p:allProducts)
		{
			System.out.println("Name : "+p.getProductName()+" Price : "+p.getPrice());
		}
		assertNotNull(allProducts);
	}
	

	@Test
	public void getProductByIdTest(){
	Product prod = productService.getProductByID(2);
	System.out.println("Name : "+prod.getProductName()+" Price : "+prod.getPrice());
	}
	
	

	@Test
	public void deleteProductById(){
		
	boolean result = productService.deleteProduct(3);
	if(result)
	{
		System.out.println("Product Successfully Deleted!!");
	}
	else
	{
		System.out.println("Error.. Product Not Deleted");
	} 
	}
	
	@Ignore
	@Test
	public void addProductTest()
	{
	
	productService.addProduct(product);
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
	}
	}
	
/*	@Test
	public void updateProduct() {
		productService.updateProduct(product);
		product.setProductName("Skinny");
		product.setCategoryName("Men");
		product.setDescription("Idle for casual wear");
		product.setPrice(8999);
		product.setQuantity(29);
		product.setSeller("Wrangler");
		product.setImage("img6.jpg");
		boolean result = productService.addProduct(product);
		if(result)
		{
			System.out.println("Product Successfully Added!!");
		}
		else
		{
			System.out.println("Error.. Product Not Inserted");
		}
		
	}*/
	
}
	
	
	
	
	
	