package com.walmart.api.order.entry;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="order_entity")
public class Order {
	
	@Id
	private String id;
	private String item;
	private int price;
	private String couponCode;

}
