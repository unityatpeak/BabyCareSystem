package com.cg.babycare.service;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.babycare.bean.BabyHealthCare;
import com.cg.babycare.bean.BabyProduct;
import com.cg.babycare.dao.BabyDaoImpl;
import com.cg.babycare.dao.IBabyDao;
import com.cg.babycare.exception.BabyCareException;


public class BabyServiceImpl implements IBabyService
{

	IBabyDao babyDao;
	 public String addBaby(BabyHealthCare baby) throws BabyCareException, ClassNotFoundException, FileNotFoundException, SQLException
	 {
	 	 
	 		babyDao=(IBabyDao) new BabyDaoImpl();	
	 		String babySeq;
	 		babySeq= babyDao.addBaby(baby);
	 		return babySeq; 

	 }
	 	
	 @Override
	 public BabyHealthCare viewBabyDetails(String babyId) throws ClassNotFoundException, FileNotFoundException, BabyCareException, SQLException {
		    babyDao=new BabyDaoImpl();
			BabyHealthCare babyHealthCare=null;
			babyHealthCare=babyDao.viewBabyDetails(babyId);
			return babyHealthCare;
	 }
	 @Override
	 public String addProduct(BabyProduct babyProduct) throws ClassNotFoundException, FileNotFoundException, SQLException 
	 {
		    babyDao=(IBabyDao) new BabyDaoImpl();	
	 		String babySeq1;
	 		babySeq1= babyDao.addProduct(babyProduct);
	 		return babySeq1; 
	 }
	 @Override
	 public BabyProduct viewBabyProduct(String proName) throws ClassNotFoundException, FileNotFoundException, SQLException {
		    babyDao=new BabyDaoImpl();
			BabyProduct babyProduct=null;
			babyProduct=babyDao.viewBabyProduct(proName);
			return babyProduct;
	 }





	 /*public void validateBaby(BabySittingService babySittingService) throws BabyCareException
	 {
	 	List<String> validationErrors = new ArrayList<String>();
	 	
	 	
	 	if(!(isValidName(babySittingService.getBabyName()))) 
	 	{
	 		validationErrors.add("\n Baby Name Should Be In Alphabets and minimum 3 characters long ! \n");
	 	}
	 		
	 		
	 		
	      if(!(isValidAge(babySittingService.getBabyAge())))
	      {
	     	 validationErrors.add("\n Baby age should be less than 4 ! \n");
	      }
	      
	      
	 	//Validating Baby Gender
	 	if(!(isValidGender(babySittingService.getBabyGender()))) 
	 	{
	 		validationErrors.add("\n Gender should be single character ! \n");
	 	}
	 	
	 	
	 	//Validating Father's Name
	 	if(!(isValidFatherName(babySittingService.getFatherName())))
	 	
	 	{
	 		validationErrors.add("\n Name Should Be In Alphabets and minimum 3 characters long \n");
	 	}
	 	
	 	
	 	if(!(isValidMotherName(babySittingService.getMotherName())))
	 	{
	 		validationErrors.add("\n Name Should Be In Alphabets and minimum 3 characters long \n");
	 	}
	 	
	 		
	 	if(!(isValidAddress(babySittingService.getAddress())))
	 	{
	 		validationErrors.add("\n Name Should Be In Alphabets and minimum 3 characters long \n");
	 	}
	 			
	 	
	 	if(!(isValidContact(babySittingService.getContact())))
	 	{
	 		validationErrors.add("\n Name Should Be In Alphabets and minimum 3 characters long \n");
	 	}
	 	
	 	
	      if(!validationErrors.isEmpty())
	 	{
	 		throw new BabyCareException(validationErrors +"");
	     }
	 }
	 private boolean isValidContact(String contact) 
	 {
	 	 Pattern contactPattern=Pattern.compile("^[A-Za-z]{3,}$");
	      Matcher contactMatcher=contactPattern.matcher(contact);
	      return  contactMatcher.matches();
	 }
	 private boolean isValidAddress(String address) 
	 {
	 	return (address.length() > 10);
	 }
	 private boolean isValidMotherName(String motherName) {
	 	 Pattern motherNamePattern=Pattern.compile("^[A-Za-z]{3,}$");
	      Matcher motherNameMatcher=motherNamePattern.matcher(motherName);
	      return  motherNameMatcher.matches();
	 }
	 private boolean isValidFatherName(String fatherName) {
	 	 Pattern fatherNamePattern=Pattern.compile("^[A-Za-z]{3,}$");
	      Matcher fatherNameMatcher=fatherNamePattern.matcher(fatherName);
	      return fatherNameMatcher.matches();
	 }
	 private boolean isValidGender(char babyGender ) 
	 {    String baby_gender= String.valueOf(babyGender);
	 	 Pattern genderPattern=Pattern.compile("[m,f]{1}");
	      Matcher genderMatcher=genderPattern.matcher(baby_gender);
	      return genderMatcher.matches();
	 }
	 private boolean isValidAge(int babyAge) 
	 {    String baby_age= String.valueOf(babyAge);
	 	 Pattern agePattern=Pattern.compile("[1-4] {1}");
	      Matcher ageMatcher=agePattern.matcher( baby_age);
	      return ageMatcher.matches();
	 	
	 }
	 private boolean isValidName(String babyName) 
	 {    Pattern namePattern=Pattern.compile("^[A-Za-z]{3,}$");
	      Matcher nameMatcher=namePattern.matcher(babyName);
	      return nameMatcher.matches();
	 	
	 }*/

	 
    
    

	 public void validateProduct(BabyProduct babyProduct)
	 { 
	 	List<String> validationErrors = new ArrayList<String>();
	 	
	 	
	 	if(!(isValidProName(babyProduct.getProName()))) 
	 	{
	 		validationErrors.add("\n Baby Name Should Be In Alphabets and minimum 3 characters long ! \n");
	 	}
	 		
	 	if(!(isValidProPrice(babyProduct.getProPrice())))
	 	{
	 		validationErrors.add("\n Price Should be numeric and start with 1-9 ! \n");
	 	}
	 }	
	

	 private boolean isValidProPrice(String proPrice) 
	 {   String pro_price= String.valueOf(proPrice);
		 Pattern proPricePattern=Pattern.compile("^[A-Za-z]{3,}$");
	     Matcher proPriceMatcher=proPricePattern.matcher(pro_price);
	     return  proPriceMatcher.matches();
	 }

	private boolean isValidProName(String proName) 
	 {
	 	Pattern proNamePattern=Pattern.compile("^[A-Za-z]{3,}$");
	     Matcher proNameMatcher=proNamePattern.matcher(proName);
	     return  proNameMatcher.matches();
	 }
	 
	 
	 
	 
	 

	 public void validateBaby1(BabyHealthCare babyHealthCare) throws BabyCareException
	 {
	 	List<String> validationErrors1 = new ArrayList<String>();
	 	
	 	
	 	if(!(isValidName1(babyHealthCare.getBabyName()))) 
	 	{
	 		validationErrors1.add("\n Baby Name Should Be In Alphabets and minimum 3 characters long ! \n");
	 	}
	 		
	 		
	 		
	      if(!(isValidAge1(babyHealthCare.getBabyAge())))
	      {
	     	 validationErrors1.add("\n Baby age should be less than 4 ! \n");
	      }
	      
	      
	 	//Validating Baby Gender
	 	if(!(isValidGender1(babyHealthCare.getBabyGender()))) 
	 	{
	 		validationErrors1.add("\n Gender should be single character i.e. M or F ! \n");
	 	}
	 	
	 	
	 	//Validating Father's Name
	 	if(!(isValidFatherName1(babyHealthCare.getFatherName())))
	 	
	 	{
	 		validationErrors1.add("\n Name Should Be In Alphabets and minimum 3 characters long \n");
	 	}
	 	
	 	
	 	if(!(isValidMotherName1(babyHealthCare.getMotherName())))
	 	{
	 		validationErrors1.add("\n Name Should Be In Alphabets and minimum 3 characters long \n");
	 	}
	 	
	 		
	 	if(!(isValidAddress1(babyHealthCare.getAddress())))
	 	{
	 		validationErrors1.add("\n Address should be 10 characters long \n");
	 	}
	 			
	 	
	 	if(!(isValidContact1(babyHealthCare.getContact())))
	 	{
	 		validationErrors1.add("\n Contact Should start from 6,7,8,9 and should be 10 digits long \n");
	 	}
	 	
	 	
	      if(!validationErrors1.isEmpty())
	 	{
	 		throw new BabyCareException(validationErrors1 +"");
	     }
	 }
	 private boolean isValidContact1(String contact) 
	 {
	 	 Pattern contactPattern=Pattern.compile("^[6-9]{1}[0-9]{9}$");
	      Matcher contactMatcher=contactPattern.matcher(contact);
	      return  contactMatcher.matches();
	 }

	 private boolean isValidAddress1(String address) 
	 {
	 	return (address.length() > 10);
	 }

	 private boolean isValidMotherName1(String motherName) {
	 	 Pattern motherNamePattern=Pattern.compile("^[A-Za-z]{3,}$");
	      Matcher motherNameMatcher=motherNamePattern.matcher(motherName);
	      return  motherNameMatcher.matches();
	 }

	 private boolean isValidFatherName1(String fatherName) {
	 	 Pattern fatherNamePattern=Pattern.compile("^[A-Za-z]{3,}$");
	      Matcher fatherNameMatcher=fatherNamePattern.matcher(fatherName);
	      return fatherNameMatcher.matches();
	 }

	 private boolean isValidGender1(String babyGender ) 
	 {    String baby_gender= String.valueOf(babyGender);
	 	 Pattern genderPattern=Pattern.compile("[MF]{1}");
	      Matcher genderMatcher=genderPattern.matcher(baby_gender);
	      return genderMatcher.matches();
	 }

	 private boolean isValidAge1(String babyAge) 
	 {    
	 	Pattern babyAgePattern=Pattern.compile("[1-4]{1}");
	     Matcher babyAgeMatcher=babyAgePattern.matcher(babyAge);
	     return babyAgeMatcher.matches();

	 }

	 private boolean isValidName1(String babyName) 
	 {    Pattern namePattern=Pattern.compile("^[A-Za-z]{3,}$");
	      Matcher nameMatcher=namePattern.matcher(babyName);
	      return nameMatcher.matches();
	 	
	 }
	 public boolean validateBabyId(String babyId) {
			
			Pattern idPattern = Pattern.compile("[0-9]{1,4}");
			Matcher idMatcher = idPattern.matcher(babyId);
			
			if(idMatcher.matches())
				return true;
			else
				return false;		
		}

	

	public boolean validProductName(String proName) 
	{
		Pattern proPattern = Pattern.compile("[A-z]{5,}");
		Matcher proMatcher = proPattern.matcher(proName);
		
		if(proMatcher.matches())
			return true;
		else
			return false;
	}

	

}


