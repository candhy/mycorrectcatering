package com.cg.cater.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cg.cater.bean.CaterBean;
import com.cg.cater.bean.OrderBean;
import com.cg.cater.exception.CaterException;


public interface ICaterService {
	
	 public CaterBean viewchoice( double payamount) throws   ClassNotFoundException, IOException, SQLException, CaterException;
	public String add(CaterBean cater) throws   ClassNotFoundException, IOException, SQLException, CaterException;
	public CaterBean viewCustomerDetails(String caterid)throws  CaterException, SQLException, ClassNotFoundException, IOException;
	public String add(OrderBean order) throws   ClassNotFoundException, IOException, SQLException, CaterException;
	public List retrieveAll()throws  CaterException, ClassNotFoundException, IOException, SQLException;


}
