package com.tedu.sp01.service;


import com.tedu.sp01.pojo.Order;

public interface OrderService {
	/**
	 * 通过订单Id来获取商品列表
	 * @param orderId
	 * @return
	 */
	Order getOrder(String orderId);
	void addOrder(Order order);
}