package com.java.order.dao;

import org.springframework.data.repository.CrudRepository;

import com.java.order.entity.OrderDetail;

public interface OrderRepository extends CrudRepository<OrderDetail,String>{

}
