package com.cg.babycare.dao;

public interface QueryMapper 
{
	 
	 String VIEW_BABY_DETAILS_QUERY="select * from Baby_details where baby_Id=?";
	 
	 String VIEW_PRODUCT_DETAILS_QUERY="select * from Product_details where pro_name=?";
	 
	 String INSERT_QUERY_BABY="Insert into Baby_Details values(Baby_Id.nextval,?,?,?,?,?,?,?)";
	 
	 String INSERT_QUERY_PRODUCT="Insert into Product_Details values( Product_Id.nextval,?,?,?)";
	 
	 String BABYID_QUERY_SEQUENCE="SELECT Baby_Id.CURRVAL FROM DUAL";
	 
	 String SELECT_ALL_QUERY="SELECT * FROM Baby_Details order by Baby_Id";
	 
	 String SELECT_ALL_PRODUCT="SELECT * FROM Product_Details";
}
