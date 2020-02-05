package com.hcl.ing.hungerbox.dto;

import java.util.List;

import com.hcl.ing.hungerbox.entity.Items;

public class RequestDTO {
	private Long vendorId;
	private String orderDate;
	private List<Items> items;
	public Long getVendorId() {
		return vendorId;
	}
	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}

}
