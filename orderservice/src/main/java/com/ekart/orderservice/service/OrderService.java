package com.ekart.orderservice.service;

import com.ekart.orderservice.model.OrderRequest;
import com.ekart.orderservice.model.OrderResponse;

public interface OrderService {
	long placeOrder(OrderRequest orderRequest);

	OrderResponse getOrderDetails(long orderId);
}
