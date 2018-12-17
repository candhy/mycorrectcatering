package com.cg.cater.bean;

import java.sql.Date;

public class CaterBean {
	private String orderid;
	private String customername;
	private String phonenumber;
	private String address;
	private double payAmount;
	private Date deleverydate;
	private String comboname;
	
	public String getComboname() {
		return comboname;
	}
	public void setComboname(String comboname) {
		this.comboname = comboname;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}
	public Date getDeleverydate() {
		return deleverydate;
	}
	public void setDeleverydate(Date deleverydate) {
		this.deleverydate = deleverydate;
	}
	@Override
	public String toString() {
		return "CaterBean [orderid=" + orderid + ", customername=" + customername + ", phonenumber=" + phonenumber
				+ ", address=" + address + ", payAmount=" + payAmount + ", deleverydate=" + deleverydate
				+ ", comboname=" + comboname + "]";
	}
	
	
	
	
	
	

}
