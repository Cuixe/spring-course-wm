package com.walmart.api.order.feing.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.walmart.api.order.rest.response.CouponResponse;

@FeignClient(name="api-gateway")
public interface CouponServiceFeingCient {
	
	@GetMapping("coupon-services/api/coupon/couponCode/{cuponCode}")
	CouponResponse getCouponCode(@PathVariable("cuponCode") String cuponCode);
	
}
