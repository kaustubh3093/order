package com.java.order.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.order.dao.OrderRepository;
import com.java.order.entity.OrderDetail;
import com.java.order.exception.OrderNotFoundException;

@Service
public class OrderServiceImpl implements OrderService{

	private static final Logger LOG = LoggerFactory.getLogger(OrderServiceImpl.class);
	
	@Autowired
	private OrderRepository orderRepository;
	@Override
	public OrderDetail create(OrderDetail theOrder) {
		LOG.debug("Creating order [{}]", theOrder);
		return orderRepository.save(theOrder);
	}
	
	@Override
	public OrderDetail findByOrderId(String order_id) {
		LOG.debug("Checking for an order with id [{}]", order_id);
		Optional<OrderDetail> orderDetail = orderRepository.findById(order_id);
		if(!orderDetail.isPresent()) {
			LOG.debug("Order does not exist for the order id [{}]", order_id);
			throw new OrderNotFoundException("Order with id " + order_id + " doesn't exist.");
		}
		return orderDetail.get();
	}
	
	@Override
	public List<OrderDetail> createMany(List<OrderDetail> theOrder) {
		LOG.debug("Creating bulk order [{}]", theOrder);
		theOrder.forEach(order -> orderRepository.save(order));
		return theOrder;
	}
	
	@Override
	public String remove(String order_id) {
		LOG.debug("Changing the order status to cancelled for order id [{}]", order_id);
		Optional<OrderDetail> orderDetail = orderRepository.findById(order_id);
		if(!orderDetail.isPresent()) {
			LOG.debug("Cannot change the status as order_id not present in the database [{}]", order_id);
			throw new OrderNotFoundException("Order with id " + order_id + " doesn't exist.");
		}
		orderDetail.get().setOrder_status("Cancelled");
		orderDetail.get().setOrder_modified_date(new Date());
		orderRepository.save(orderDetail.get());
		return "Successfully cancelled the order";
	}
	@Override
	public String updateOrderStatus(List<OrderDetail> theOrder) {
		LOG.debug("Changing the order_status in bulk for orders [{}]", theOrder);
		for(OrderDetail order: theOrder) {
			String order_id = order.getOrder_id();
			String order_status = order.getOrder_status();
			if(order_id != null && order_status != null) {
				Optional<OrderDetail> orderDetail = orderRepository.findById(order_id);
				if(orderDetail.isPresent()) {
					orderDetail.get().setOrder_status(order_status);
					orderDetail.get().setOrder_modified_date(new Date());
					orderRepository.save(orderDetail.get());
				}
			}
		}
		return "Updated the Orders with new status in the database successfully";
	}
	
}
