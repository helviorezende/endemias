package org.wpattern.test.helviorezende.provap1.products;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.provap1.ordersentity.OrdersEntity;
import org.wpattern.helviorezende.provap1.productsentity.ProductsEntity;
import org.wpattern.helviorezende.provap1.productsentity.ProductsRepository;
import org.wpattern.test.helviorezende.provap1.AbstractTest;

public class ProductsRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(ProductsRepositoryTest.class);
	
	@Autowired
	private ProductsRepository productsrepository;
	
	
	@Test
	public void findAllTest(){
		List<ProductsEntity> products = this.productsrepository.findAll();
		LOGGER.info("FindAll():" + products);
	}
	
	@Test
	public void testInsert(){
		ProductsEntity products = new ProductsEntity();
		
		products.setProductName("memoria ddr4");
		products.setSupplierId(9);
		products.setCategoryId(2);
		products.setQuantityPerUnit(5);
		products.setUnitPrice(12345);
		products.setUnitsInStock(7);
		products.setUnitsOnOrder(2);
		products.setReorderlevel(2);
		products.setDiscontinued("n");	
	
		products = this.productsrepository.save(products);				
		LOGGER.info (products + " " );
	}
	
	@Test
	public void updateProducts() {
		ProductsEntity products = productsrepository.findOne(1L);
		products.setProductName("notebook");
		productsrepository.save(products);
		LOGGER.info("Update products: " + this.productsrepository.findAll());
		}
	
	@Test
	public void deleteProducts() {
		this.productsrepository.delete(1L);
		List<ProductsEntity> products = this.productsrepository.findAll();
		LOGGER.info("Products delete: " + products);
	}
}
