package com.cg.babycare.dao;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import com.cg.babycare.bean.BabyHealthCare;
import com.cg.babycare.bean.BabyProduct;
import com.cg.babycare.exception.BabyCareException;
import com.cg.babycare.util.BabyCareDBConnection;

public class BabyDaoImpl implements IBabyDao
{
	@Override
	public String addBaby(BabyHealthCare baby) throws BabyCareException, ClassNotFoundException, FileNotFoundException, SQLException
	{
		Connection connection =BabyCareDBConnection.getConnection();	
		PreparedStatement preparedStatement= null;
		ResultSet rs= null;
		
		
		
		String babyId= null;
		int queryResult=0;
		
		    
		
		try
		{   Statement st= connection.createStatement();
			//prepareStatement= connection.prepareStatement("Insert into Baby_Details values(Baby_Id.nextval,?,?,?,?,?,?,?)");
		    preparedStatement= connection.prepareStatement(QueryMapper.INSERT_QUERY_BABY);
			preparedStatement.setString(1, baby.getBabyName());
			preparedStatement.setString(2, baby.getBabyAge());
			preparedStatement.setString(3, baby.getBabyGender());
			preparedStatement.setString(4, baby.getFatherName());
			preparedStatement.setString(5, baby.getMotherName());
			preparedStatement.setString(6, baby.getAddress());
			preparedStatement.setString(7, baby.getContact());
			queryResult=preparedStatement.executeUpdate();
			
			preparedStatement = connection.prepareStatement(QueryMapper.BABYID_QUERY_SEQUENCE);
			rs= preparedStatement.executeQuery();

			
		
	
			preparedStatement.executeUpdate();
			//rs = st.executeQuery("SELECT * FROM Baby_Details order by Baby_Id");
			  rs = st.executeQuery(QueryMapper.SELECT_ALL_QUERY);
			while(rs.next())
			    {
				
				System.out.println("Baby ID: "+rs.getString(1));
				System.out.println("Baby Name: "+rs.getString(2));
				System.out.println("Baby Age: "+rs.getString(3));
				System.out.println("Baby Gender: "+rs.getString(4));
				System.out.println("Father Name: "+rs.getString(5));
				System.out.println("Mother Name: "+rs.getString(6));
				System.out.println("Address: "+rs.getString(7));
				System.out.println("Contact: "+rs.getString(8));
				
				
				babyId= rs.getString(1);
						
			  }
			
		}
		
		catch(SQLException sql)
		
		{
			System.out.println(sql);
		}
		
		
		return babyId;
		
	}

	

	@Override
	public BabyHealthCare viewBabyDetails(String babyId) throws BabyCareException, ClassNotFoundException, FileNotFoundException, SQLException 
	{
		
			
         Connection connection=BabyCareDBConnection.getConnection();
		
		
		PreparedStatement preparedStatement=null;
		ResultSet resultset = null;
		BabyHealthCare babyHealthCare=null;
		
		    preparedStatement=connection.prepareStatement(QueryMapper.VIEW_BABY_DETAILS_QUERY);
			preparedStatement.setString(1,babyId);
			resultset=preparedStatement.executeQuery();
			
			while(resultset.next())
			{
				babyHealthCare = new BabyHealthCare();
				babyHealthCare.setBabyName(resultset.getString(2));
				babyHealthCare.setBabyAge(resultset.getString(3));
				babyHealthCare.setBabyGender(resultset.getString(4));
				babyHealthCare.setFatherName(resultset.getString(5));
				babyHealthCare.setMotherName(resultset.getString(6));
				babyHealthCare.setAddress(resultset.getString(7));
				babyHealthCare.setContact(resultset.getString(8));
				
				
			}
			

			return babyHealthCare;
			
		
		
			
	}
		
	

	

	@Override
	public String addProduct(BabyProduct babyProduct) throws ClassNotFoundException, FileNotFoundException, SQLException 
	{
		Connection connection =BabyCareDBConnection.getConnection();	
		PreparedStatement prepareStatement= null;
		ResultSet rs1= null;
		//ResultSet rs1= null;
		
		
		String proId=null;
		//int queryResult=0;
		
		    
		
		try
		{   Statement st= connection.createStatement();
			//prepareStatement= connection.prepareStatement("Insert into Product_Details values( Product_Id.nextval,?,?,?)");
		    prepareStatement= connection.prepareStatement(QueryMapper.INSERT_QUERY_PRODUCT);
			prepareStatement.setString(1, babyProduct.getProName());
			prepareStatement.setString(2, babyProduct.getProPrice());
			prepareStatement.setString(3, babyProduct.getDiscount());
			
			
			prepareStatement.executeUpdate();
			//rs1 = st.executeQuery("SELECT * FROM Product_Details ");
			  rs1 = st.executeQuery(QueryMapper.SELECT_ALL_PRODUCT);

			while(rs1.next())
			    {
				
				System.out.println("Product ID: "+rs1.getString(1));
				System.out.println("Product Name: "+rs1.getString(2));
				System.out.println("Product Price: "+rs1.getString(3));
				System.out.println("Discount: "+rs1.getString(4));
				
				
				
				proId= rs1.getString(1);
						
			  }
			return proId;
		}
		
		catch(SQLException sql)
		
		{
			System.out.println(sql);
		}
		
		
		return proId;
		
	}

	@Override
	public BabyProduct viewBabyProduct(String proName) throws ClassNotFoundException, FileNotFoundException, SQLException 
	{
Connection connection=BabyCareDBConnection.getConnection();
		
		
		PreparedStatement preparedStatement=null;
		ResultSet resultset1 = null;
		BabyProduct babyProduct=null;
		
		    //preparedStatement=connection.prepareStatement("select * from Product_details where pro_name=?");
		    preparedStatement=connection.prepareStatement(QueryMapper.VIEW_PRODUCT_DETAILS_QUERY);
			preparedStatement.setString(1,proName);
			resultset1=preparedStatement.executeQuery();
			
			while(resultset1.next())
			{
				babyProduct = new BabyProduct();
				babyProduct.setProId(resultset1.getString(1));
				babyProduct.setProPrice(resultset1.getString(3));
				babyProduct.setDiscount(resultset1.getString(4));
				
				
				
				
			}
			

			return babyProduct;
	}

}
