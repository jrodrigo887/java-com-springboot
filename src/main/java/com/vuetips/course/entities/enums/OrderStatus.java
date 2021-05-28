package com.vuetips.course.entities.enums;

public enum OrderStatus {
	WAITING_PAIMENT(1),
	PAID(2),
	SHIPPED(2),
	DELIVERED(3),
	CANCELED(4);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value: OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Inválid OrderStatus code");
	}
}
