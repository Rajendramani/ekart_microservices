package com.ekart.paymentservice.service;

import com.ekart.paymentservice.model.PaymentRequest;
import com.ekart.paymentservice.model.PaymentResponse;

public interface PaymentService {
	//long doPayment(PaymentRequest paymentRequest);

	PaymentResponse getPaymentDetailsByOrderId(String orderId);

	Long doPayment(PaymentRequest paymentRequest);
}
