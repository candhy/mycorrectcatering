package com.cg.cater.bean;

import java.time.LocalDate;

public class OrderBean {
	private String orderid;
	private String comboname;
	private double totalprice;
	LocalDate date;
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getComboname() {
		return comboname;
	}
	public void setComboname(String comboname) {
		this.comboname = comboname;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "OrderBean [orderid=" + orderid + ", comboname=" + comboname + ", totalprice=" + totalprice + ", date="
				+ date + "]";
	}
	
	

}
