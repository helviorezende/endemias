package org.wpattern.test.helviorezende.provap1.orders;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.provap1.categoriesentity.CategoriesEntity;
import org.wpattern.helviorezende.provap1.ordersentity.OrdersEntity;
import org.wpattern.helviorezende.provap1.ordersentity.OrdersRepository;
import org.wpattern.test.helviorezende.provap1.AbstractTest;

public class OrdersRepositoryTest extends AbstractTest{
	private static final Logger LOGGER = Logger.getLogger(OrdersRepositoryTest.class);
	
	@Autowired
	private OrdersRepository ordersrepository;
	
	@Test
	public void findAllTest(){
		List<OrdersEntity> orders = this.ordersrepository.findAll();
			LOGGER.info("FindAll():" + orders);
		}
	
	@Test
	public void testInsert(){
		
		OrdersEntity orderspacote = new OrdersEntity();
		
		orderspacote.setCustomerId("Mem");
		orderspacote.setEmployeeId(2);
		orderspacote.setOrderDate("25042017");
		orderspacote.setRequiredDate("25042017");
		orderspacote.setShippedDate("25042017");
		orderspacote.setShipVia(2);
		orderspacote.setFreight(20);
		orderspacote.setShipName("memoria");
		orderspacote.setShipAddress("belarmino 100");
		orderspacote.setShipCity("Araguari");
		orderspacote.setShipRegion("Norte");
		orderspacote.setShipPostalCode("38900123");
		orderspacote.setShipCountry("longe");
	
		orderspacote = this.ordersrepository.save(orderspacote);				
		LOGGER.info (orderspacote + " " );
	}
	
	
	@Test
	public void updateOrders() {
		OrdersEntity orders = ordersrepository.findOne(1L);
		orders.setShipName("memoria");
		ordersrepository.save(orders);
		LOGGER.info("Update orders: " + this.ordersrepository.findAll());
		}
	
	@Test
	public void deleteCategories() {
		this.ordersrepository.delete(1L);
		List<OrdersEntity> orders = this.ordersrepository.findAll();
		LOGGER.info("Orders delete: " + orders);
	}
	
}
