package com.java.order.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.order.entity.OrderDetail;
import com.java.order.service.OrderService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/bulk")
@Api(description = "Endpoints to create and update bulk orders")
public class BulkOrderController {

	private static final Logger LOG = LoggerFactory.getLogger(BulkOrderController.class);
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(method = RequestMethod.POST , value = "/batch")
	@ApiOperation(value = "Create the order in bulk in database",
					notes = "Client will send the list of orders and application will save the entire list of orders in the database")
	@ApiResponses(value = {
					@ApiResponse(code = 200, message = "OK"),
					@ApiResponse(code = 500, message = "Internal server error")
	})
	public List<OrderDetail> createBulkOrder(@RequestBody List<OrderDetail> theOrder) {
		LOG.debug("Received a request to create bulk orders [{}]", theOrder);
		return orderService.createMany(theOrder);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/batch")
	@ApiOperation(value = "Update the order status if there exists an order with the given id",
					notes = "Client will send the list of orders with two parameter order_id, order_status "
							+ "and application will search for each of the order id and update it's order status")
	@ApiResponses(value = {
					@ApiResponse(code = 200, message = "OK"),
					@ApiResponse(code = 500, message = "Internal server error")
	})
	public String updateBulkOrderStatus(@RequestBody List<OrderDetail> theOrder) {
		LOG.debug("Received a request to update the order_status of bulk orders [{}]", theOrder);
		return orderService.updateOrderStatus(theOrder);
	}
	
	
	
}
