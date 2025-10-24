package com.example.demo.cart.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderItemDTO {
	private Long id;
	private Integer qty;
	private ProductDTO product;
	/* 
	private String name;
	private Integer price;
	private String imageBase64;
	*/
}
