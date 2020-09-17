package com.java.order.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.java.order.dao.OrderRepository;
import com.java.order.entity.OrderDetail;

@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK
)
@AutoConfigureMockMvc
@ActiveProfiles("application-integrationtest.properties")
public class SingleOrderControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Before
    public void setup() {
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setOrder_id("order@1234");
		orderDetail.setOrder_status("Placed");
		orderDetail.setOrder_billing_city("Chicago");
		
		orderRepository.save(orderDetail);
	}
	
	@After
    public void cleanup() {
		orderRepository.deleteAll();
	}
	
	@Test
	public void findByID() throws Exception{
		 mvc.perform(MockMvcRequestBuilders.get("/order/order@1234"))
        .andExpect(MockMvcResultMatchers.status()
                                        .isOk());
	}
	
	@Test
	public void findByID404() throws Exception{
		 mvc.perform(MockMvcRequestBuilders.get("/order/order@7777"))
        .andExpect(MockMvcResultMatchers.status()
                                        .isNotFound());
	}
}
