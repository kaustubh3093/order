package com.java.order.controller;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.order.dao.OrderRepository;
import com.java.order.entity.OrderDetail;

@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK
)
@AutoConfigureMockMvc
@ActiveProfiles("application-integrationtest.properties")
public class BulkOrderControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Before
    public void setup() {
		
	}
	
	@After
    public void cleanup() {
		orderRepository.deleteAll();
	}
	
	@Test
	public void create () throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		OrderDetail orderDetail1 = new OrderDetail();
		orderDetail1.setOrder_id("order@1234");
		orderDetail1.setOrder_status("Placed");
		orderDetail1.setOrder_billing_city("Chicago");
		OrderDetail orderDetail2 = new OrderDetail();
		orderDetail2.setOrder_id("order@1234");
		orderDetail2.setOrder_status("Placed");
		orderDetail2.setOrder_billing_city("Chicago");
		List<OrderDetail> orderList = new ArrayList<>();
		orderList.add(orderDetail1);
		orderList.add(orderDetail2);
		
		mvc.perform(MockMvcRequestBuilders.post("/bulk/batch")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsBytes(orderList))
                )
				 .andExpect(MockMvcResultMatchers.status().isOk());
	}

}
