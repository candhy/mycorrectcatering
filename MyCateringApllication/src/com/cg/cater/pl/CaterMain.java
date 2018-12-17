package com.cg.cater.pl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cg.cater.bean.CaterBean;
import com.cg.cater.bean.OrderBean;
import com.cg.cater.exception.CaterException;
import com.cg.cater.service.CaterserviceImpl;
import com.cg.cater.service.ICaterService;

public class CaterMain {
	
	static Scanner sc=new Scanner(System.in);
	static ICaterService caterService=null;
	static CaterserviceImpl caterServiceImpl=null;

    
	public static void main(String[] args) throws ClassNotFoundException, CaterException, SQLException, IOException {
		 
		    CaterBean caterBean=null;
		    String caterId=null;
		    OrderBean orderBean=null;
		    String orderId=null;
		    
		    
		    int option=0;
		    double payAmount = 0;
		    char iterator=0;
		   
		    do
		    {
			 System.out.println();
			 System.out.println();
			 System.out.println("___________________________________________");
			 System.out.println("...........welcome to Pizza hut...............");
			 System.out.println("________________________________");
			 System.out.println("1.FOODIES ENTERING---CHOOSE UR FOOOD");
			 System.out.println("2 FOOD BISHOP/ADMINISTRATOR");
			 System.out.println("______________________________");
			
			 CaterBean cater=new CaterBean();
			 try 
			 {
option=sc.nextInt();
switch(option)
{
case 1:
        	 
        	 System.out.println("select ur combo choice");
        	 System.out.println("combo1--ZINGY PARCEL,MEDIUM SIZE PIZZA,BURGER=Rs.300");
			 System.out.println("combo2--CAPSICUM RICE,MILKSHAKE,ZINGY PARCEL,MEDIUM SIZE PIZZA,BURGER=Rs=520");
			 System.out.println("combo3--ICECREAM,MILKSHAKE,ZINGY PARCEL,MEDIUM SIZE PIZZA,BURGER=Rs.430");
			 System.out.println("combo4--MILKSHAKE,MUSHROOM PIZZA,HAMBURGER,FRESH JUICE=Rs.234");
			 System.out.println("combo5--CAPSICUM RICE,MUSHROOM PIZZA,HAMBURGER,FRESH JUICE=Rs.189");
			 System.out.println("combo6--BURGER,MUSHROOM PIZZA,HAMBURGER,ZINGY PARCEL,FRESH JUICE=Rs.210");
			 System.out.println("combo7--ZINGY PARCEL,MUSHROOM PIZZA,HAMBURGER,FRESH JUICE=Rs.260");
			 System.out.println("combo8--HAMBURGER,MUSHROOM PIZZA,HAMBURGER,FRESH JUICE=Rs.320");
			 System.out.println("combo9--ZINGY PARCEL,MUSHROOM PIZZA,HAMBURGER,FRESH JUICE=Rs.245");
			 System.out.println("combo10--ZINGY PARCEL,MEDIUM SIZE PIZZA,MUSHROOM PIZZA,HAMBURGER,FRESH JUICE=Rs.435");
        	 
        	
int choice=sc.nextInt();
switch(choice)
			
			 {
			 case 1:
				 System.out.println("combo1");
				cater.setPayAmount(300);
				
				 break;
			 case 2:
				 System.out.println("combo2");
				 cater.setPayAmount(520);
				 break;
			 case 3:
                  System.out.println("combo3");
                  cater.setPayAmount(430);
				 break;
			 case 4:
				 System.out.println("combo4");
				 cater.setPayAmount(234);
				 break;
			 case 5:
				 System.out.println("combo5");
				 cater.setPayAmount(189);
				 break;
			 case 6:
				 System.out.println("combo6");
				 cater.setPayAmount(210);
				 break;
			 case 7:
				 System.out.println("combo7");
				 cater.setPayAmount(260);
				 break;
			 case 8:
				 System.out.println("combo8");
				 cater.setPayAmount(320);
				 break;
			 case 9:
				 System.out.println("combo9");
				 cater.setPayAmount(245);
				 break;
			 case 10:
				 System.out.println("combo10");
				 cater.setPayAmount(435);
				 break;
				 
			     }	
			
			 
        	 System.out.println("2.Enter the customer details"); 
             while(caterBean==null){
                {
                caterBean=populatecaterBean();
                }
           try
                {
                 caterService=new CaterserviceImpl();
                 caterId=caterService.add(caterBean);
                 System.out.println("---------------customer details has been successfully registered-----------------");
                 System.out.println("--------------customer order id is :---------------------"+caterId);
                 System.out.println("---------------ur payment is :------------------------" +cater.getPayAmount());
                
                 System.out.println("Thanku for ur order");
                
                 }
           catch(CaterException caterException)
                {
                System.err.println("ERROR :"+caterException.getMessage());
                caterException.printStackTrace();
                }
           finally
                {
          	 caterId=null;
          	 caterService=null;
          	 caterBean=null;
                }                      }
         System.out.print("Exit  Application");
			System.exit(0);
			
break;

		 
        
         
         
case 2:  
         {
         
         System.out.println("Retrieve all the details");//inserting the customer and coboo detail in the database
        	    System.out.println("2.Enter the combo details"); 
                 while(orderBean==null){
                    {
                    orderBean=populateorderBean();
                    }
                    break;
                 } 
                 System.out.println("admin");
                 System.out.println("1.Get order details");
                 System.out.println("2.Get all details of all the customer");
int ch=sc.nextInt();
switch(ch) {
    			 
    		    case 1:
                    
    		        	
    		        try
                    {
                     caterService=new CaterserviceImpl();
                     orderId=caterService.add(orderBean);
                    System.out.println("combo's details has been successfully registered");
                    System.out.println("combo order id is :"+orderId);
                    System.out.println("Ur combo has been successfully inserted");
                    }
                    catch(CaterException caterException)
                   {
                   System.err.println("ERROR :"+caterException.getMessage());
                   caterException.printStackTrace();
                   }
                   finally
                   {
             	    caterId=null;
             	    caterService=null;
             	     caterBean=null;
                   }                    
                   
                   
            
			 
                    {
				    	  System.out.println("enter order_id");
		                  caterId=sc.next();
		                  caterService=new CaterserviceImpl();
		                  System.out.println(" ur pay amount ");
		                  payAmount=sc.nextDouble();
		                  caterService=new CaterserviceImpl();
		            	  try
		            		{
		            		cater.setPayAmount(sc.nextFloat());
		            		}
		            		catch(InputMismatchException ime)
		            		{
		            			sc.nextLine();
		            			System.err.println("please enter the numeric value for  amount,try again");
		            		}
		                    caterBean= caterService.viewCustomerDetails(caterId);
		                    System.out.println(caterBean);
                    }
     
		                    
		         case 2:
		                    {	try {
									caterService = new CaterserviceImpl();
									List<CaterBean> donorList = new ArrayList<CaterBean>();
									donorList = caterService.retrieveAll();

									if (donorList != null) {
										Iterator<CaterBean> i = donorList.iterator();
										while (i.hasNext()) {
											System.out.println(i.next());
										}
									} else {
										System.out
												.println("Nobody has made a registered, yet.");
									}

								}

								catch (CaterException e) {

									System.out.println("Error  :" + e.getMessage());
									e.printStackTrace();
								}
				    }
		 
	        	break;
  
		       
				        	  
			              default:
								System.out.println("Enter a valid option[1-4]");
							}// end of switch
         }
		 }
			 }
		    	
	
						catch (InputMismatchException e) {
							sc.nextLine();
							System.err.println("Please enter a numeric value, try again");
						}
				System.out.println("Do u want to continue(y/n) :");
				iterator=sc.next().toLowerCase().charAt(0);
	 
	 }while(iterator=='y');
				
					  
		    
		    }  
	
		 				       
		    
		   
	
	  private static CaterBean populatecaterBean() {
		CaterBean cater=new CaterBean();
		System.out.println("Enter details");
		System.out.println("Enter the customer name:");
		cater.setCustomername(sc.next());
		System.out.println("Enter the customer Contact");
		cater.setPhonenumber(sc.next());
		System.out.println("Enter the customer Address");
		cater.setAddress(sc.next());
		caterServiceImpl=new CaterserviceImpl();
		try
		{
		if(caterServiceImpl.validateDonor(cater));
		return cater;
		}
		catch(CaterException donorException)
		{
			System.out.println("Invalid data");
			System.err.println(donorException.getMessage()+"\n Try Again...");
			donorException.printStackTrace();
			System.exit(0);
			
		}
		return null;
	}

	
	
	  
	  private static OrderBean populateorderBean() {
		OrderBean order=new OrderBean();
		System.out.println("Enter combo details");
		System.out.println("Enter the order id:");
		order.setOrderid(sc.next());
		System.out.println("Enter the combo name");
		order.setComboname(sc.next());
		System.out.println("the total price");
		order.setTotalprice(sc.nextDouble());
	    caterServiceImpl=new CaterserviceImpl();
		
		return order;
	}
}












