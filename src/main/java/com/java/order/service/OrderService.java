package com.java.order.service;

import java.util.List;

import com.java.order.entity.OrderDetail;

public interface OrderService {

	OrderDetail create(OrderDetail theOrder);
	OrderDetail findByOrderId(String order_id);
	List<OrderDetail> createMany(List<OrderDetail> theOrder);
	String remove(String order_id);
	String updateOrderStatus(List<OrderDetail> theOrder);
}
