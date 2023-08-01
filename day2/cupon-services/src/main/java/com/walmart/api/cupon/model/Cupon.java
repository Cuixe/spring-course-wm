package com.walmart.api.cupon.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cupon {
	
	@Id
	private String id;
	private String cuponCode;
	private int discount;

}
