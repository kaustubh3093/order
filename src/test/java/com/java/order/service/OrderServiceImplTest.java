package com.java.order.service;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.java.order.dao.OrderRepository;
import com.java.order.entity.OrderDetail;


@RunWith(SpringRunner.class)
public class OrderServiceImplTest {
	
	@TestConfiguration
	static class OrderServiceImplTestConfiguration {
		
		@Bean
		public OrderService getOrderService() {
			return new OrderServiceImpl();
		}
	}
	
	@Autowired
	private OrderService orderService;
	
	@MockBean
	private OrderRepository orderRepository;
	
	private OrderDetail order;
	
	private String order_id = "order@1234"; 
	@Before
    public void setup() {
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setOrder_id(order_id);
		orderDetail.setOrder_status("Placed");
		orderDetail.setOrder_item_name("Pencil");
		
		order = orderDetail;
		Mockito.when(orderRepository.findById(order_id))
    		.thenReturn(Optional.of(order));
		
		Mockito.when(orderRepository.save(orderDetail))
		.thenReturn(orderDetail);
	}
	
	@Test
	public void findById() {
		OrderDetail orderDetail = orderService.findByOrderId(order_id);
		
		Assert.assertEquals("Order should match", orderDetail, order);
	}
	
	@Test
	public void create() {
		OrderDetail orderDetail = orderService.create(order);
		
		Assert.assertEquals("Order should match", orderDetail, order);
	}
}
