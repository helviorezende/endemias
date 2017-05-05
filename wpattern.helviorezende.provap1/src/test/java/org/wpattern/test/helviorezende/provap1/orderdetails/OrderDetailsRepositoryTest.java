
package org.wpattern.test.helviorezende.provap1.orderdetails;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.provap1.categoriesentity.CategoriesEntity;
import org.wpattern.helviorezende.provap1.orderdetailsentity.OrderDetailsEntity;
import org.wpattern.helviorezende.provap1.orderdetailsentity.OrderDetailsRepository;
import org.wpattern.test.helviorezende.provap1.AbstractTest;

public class OrderDetailsRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(OrderDetailsRepositoryTest.class);
	
	@Autowired
	private OrderDetailsRepository orderdetailsrepository;
	
	@Test
	public void findAllTest(){
		List<OrderDetailsEntity> orderdetails = this.orderdetailsrepository.findAll();
		LOGGER.info("FindAll():" + orderdetails);
	}
	
	@Test
	public void testInsert(){
		OrderDetailsEntity orderdetails = new OrderDetailsEntity();
		
		orderdetails.setOrderId(2);
		orderdetails.setProductId(2);
		orderdetails.setUnitPrice(2);
		orderdetails.setQuantity(20);
		orderdetails.setDiscount(30);
		
	
		orderdetails = this.orderdetailsrepository.save(orderdetails);				
		LOGGER.info (orderdetails + " " );
	}
	
	@Test
	public void updateDetails() {
		OrderDetailsEntity orderdetails = orderdetailsrepository.findOne(1L);
		orderdetails.setQuantity(10);
		orderdetailsrepository.save(orderdetails);
		LOGGER.info("Update orderdetails: " + this.orderdetailsrepository.findAll());
		}
	
	@Test
	public void deleteDetails() {
		this.orderdetailsrepository.delete(1L);
		List<OrderDetailsEntity> orderdetails = this.orderdetailsrepository.findAll();
		LOGGER.info("Ordersdetails delete: " + orderdetails);
	}
	
	
	
	

}