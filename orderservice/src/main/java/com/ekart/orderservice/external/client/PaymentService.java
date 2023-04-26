package com.ekart.orderservice.external.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ekart.orderservice.exception.CustomException;
import com.ekart.orderservice.external.request.PaymentRequest;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;



@CircuitBreaker(name = "external", fallbackMethod = "fallback")
@FeignClient(name = "PAYMENT-SERVICE")
public interface PaymentService {

	@PostMapping("/payment")
	public ResponseEntity<Long> doPayment(@RequestBody PaymentRequest paymentRequest);

	default ResponseEntity<Long> fallback(Exception e) {
		throw new CustomException("Payment Service is not available", "UNAVAILABLE", 500);
	}
}
