package com.ekart.productservice.service;

import com.ekart.productservice.model.ProductRequest;
import com.ekart.productservice.model.ProductResponse;

public interface ProductService {
	
	long addProduct(ProductRequest productRequest);

	ProductResponse getProductById(long productId);

	void reduceQuantity(long productId, long quantity);
}
