package com.cg.cater.dao;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.cater.bean.CaterBean;
import com.cg.cater.bean.OrderBean;
import com.cg.cater.exception.CaterException;
import com.cg.cater.util.dbConnection;

public class CaterdaoImpl implements ICaterDao{

	@Override
	 public CaterBean viewchoice( double payamount) throws ClassNotFoundException, IOException, SQLException, CaterException {
		Connection connection=dbConnection.getconnection();
		ResultSet resultset=null;
		PreparedStatement preparedstatement=null;
		CaterBean payAmount = null ;
		int queryresult=0;
		CaterBean combo=new CaterBean();
		
		try
		{
			preparedstatement=connection.prepareStatement("insert into combos values(comboid.nextVal,?,?)");
			preparedstatement.setString(1, combo.getComboname());//that 1 represent the first question mark,
			preparedstatement.setDouble(2, combo.getPayAmount());
			preparedstatement.executeUpdate();
			Statement st=null;
			st=connection.createStatement();
			resultset=st.executeQuery("select * from combo");
			while(resultset.next())
				{ 
				payamount=resultset.getDouble(3);
				
				}
			                      
			                                                       
			}
	  catch(Exception sql)
		    {
			System.out.println(sql);
			sql.printStackTrace();
		    }
		System.out.println("ur payment is :" +payAmount);
		    return payAmount;
	}
	
  @Override
  
	public String add(CaterBean cater) throws   ClassNotFoundException, IOException, SQLException, CaterException{
		Connection connection=dbConnection.getconnection();
		ResultSet resultset=null;
		PreparedStatement preparedstatement=null;
		String cateringid=null;
		int queryresult=0;
		
		try
		{
			preparedstatement=connection.prepareStatement("insert into customer_Details values(cateringid.nextVal,?,?,?,Sysdate,?)");
			preparedstatement.setString(1, cater.getCustomername());//that 1 represent the first question mark,
			preparedstatement.setString(2,cater.getAddress() );
			preparedstatement.setString(3, cater.getPhonenumber());
			preparedstatement.setDouble(4, cater.getPayAmount());
			preparedstatement.executeUpdate();
			Statement st=null;
			st=connection.createStatement();
			resultset=st.executeQuery("select * from customer_Details");
			while(resultset.next())
				{ 
				cateringid=resultset.getString(1);
				}
			                      
			                                                       
			}
	  catch(Exception sql)
		    {
			System.out.println(sql);
			sql.printStackTrace();
		    }
		
		    return cateringid;
      }

	
	
	
	@Override
	
	public CaterBean viewCustomerDetails(String caterid)throws  CaterException, ClassNotFoundException, IOException, SQLException{
		Connection connection=dbConnection.getconnection();
		ResultSet resultset=null;
		Statement st=null;
		CaterBean cater=new CaterBean();
		st=connection.createStatement();
		resultset=st.executeQuery("select *from customer_details where cater_id="+caterid+"");
		
		while(resultset.next())
		{
		cater.setOrderid(resultset.getString(1));
		cater.setCustomername(resultset.getString(2));
		cater.setAddress(resultset.getString(3));
		cater.setPhonenumber(resultset.getString(4));
		cater.setDeleverydate(resultset.getDate(5));
		cater.setPayAmount(resultset.getDouble(6));
		}
		return cater;
	}

	
	
	@Override
	public List retrieveAll() throws  CaterException, ClassNotFoundException, IOException, SQLException {

		Connection connection=dbConnection.getconnection();
		int caterCount = 0;
		
		PreparedStatement ps=null;
		ResultSet resultset = null;
		
		List<CaterBean> caterList=new ArrayList<CaterBean>();
		try
		{
			ps=connection.prepareStatement("SELECT * FROM customer_details");
			resultset=ps.executeQuery();
			
			while(resultset.next())
			{	
				CaterBean cater=new CaterBean();
				cater.setOrderid(resultset.getString(1));
				cater.setCustomername(resultset.getString(2));
				cater.setAddress(resultset.getString(3));
				cater.setPhonenumber(resultset.getString(4));
				cater.setDeleverydate(resultset.getDate(5));
				cater.setPayAmount(resultset.getDouble(6));
				caterList.add(cater);
				
		        caterCount++;
			}			
			
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			throw new  CaterException("Some tehnical problem has occured. please .....Refer log");
		}
		
		finally
		{
			try 
			{
				resultset.close();
				ps.close();
				connection.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
				throw new  CaterException("Error in...so closing db connection");

			}
		}
		
		if( caterCount == 0)
			return null;
		else
			return caterList;
	
		

}

	@Override
	public String add(OrderBean order) throws ClassNotFoundException, IOException, SQLException, CaterException {
		Connection connection=dbConnection.getconnection();
		ResultSet resultset=null;
		PreparedStatement preparedstatement=null;
		String orderid=null;
		int queryresult=0;
		
		try
		{
			preparedstatement=connection.prepareStatement("insert into comboo values(orderingid.nextVal,?,?)");
			//that 1 represent the first question mark,
			preparedstatement.setString(2,order.getComboname() );
			preparedstatement.setDouble(2, order.getTotalprice());
			preparedstatement.executeUpdate();
			Statement st=null;
			st=connection.createStatement();
			resultset=st.executeQuery("select * from comboo");
			while(resultset.next())
				{ 
				orderid=resultset.getString(1);
				}
			                      
			                                                       
			}
	  catch(Exception sql)
		    {
			System.out.println(sql);
			sql.printStackTrace();
		    }
		
		    return orderid;
      }

	}




	
