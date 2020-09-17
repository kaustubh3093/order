package com.java.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping(value = "/order")
@Api(description = "Endpoints to get, create and delete a single order")
public class SingleOrderController {

	private static final Logger LOG = LoggerFactory.getLogger(SingleOrderController.class);
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(method = RequestMethod.POST , value = "/create")
	@ApiOperation(value = "Create the order in database",
				notes = "Client will send a single order and application will save the order in the database")
	@ApiResponses(value = {
				@ApiResponse(code = 200, message = "OK"),
				@ApiResponse(code = 500, message = "Internal server error")
	})
	public OrderDetail createOrder(@RequestBody OrderDetail theOrder) {
		LOG.debug("Received a request to create a order [{}]", theOrder);
		return orderService.create(theOrder);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{orderID}")
	@ApiOperation(value = "Get the order with the given order_id in Rest call",
				notes = "Fetch the order from the database")
	@ApiResponses(value = {
				@ApiResponse(code = 200, message = "OK"),
				@ApiResponse(code = 500, message = "Internal server error"),
				@ApiResponse(code = 404, message = "No vehicle entry in the database")
	})
	public OrderDetail findByID(@PathVariable("orderID") String order_id) {
		LOG.debug("Received a request to get the order with id [{}]", order_id);
		return orderService.findByOrderId(order_id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/{orderID}")
	@ApiOperation(value = "Update the Order with the given order_id",
				notes = "If we have the order with the given order_id then changed the order_status to cancelled")
	@ApiResponses(value = {
				@ApiResponse(code = 200, message = "OK"),
				@ApiResponse(code = 500, message = "Internal server error")
	})
	public String deleteOrderByID(@PathVariable("orderID") String order_id) {
		LOG.debug("Received a request to change the order status to cancelled for id [{}]", order_id);
		return orderService.remove(order_id);
	}
	
	
}
