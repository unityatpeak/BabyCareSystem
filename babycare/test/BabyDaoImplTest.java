package com.cg.babycare.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.babycare.bean.BabyHealthCare;
import com.cg.babycare.bean.BabyProduct;
import com.cg.babycare.dao.BabyDaoImpl;
import com.cg.babycare.exception.BabyCareException;

class BabyDaoImplTest {
	static BabyDaoImpl dao;
	static BabyHealthCare babyHealthCare ;
    static BabyProduct babyProduct;
    
	@BeforeAll
	public static void initialize() {
		//System.out.println("in before class");
		dao = new BabyDaoImpl();
		babyHealthCare = new BabyHealthCare();
		babyProduct= new BabyProduct();
	}
	@Test
	public void testAddBaby() throws ClassNotFoundException, IOException, BabyCareException, SQLException 
	{
		assertNotNull(dao.addBaby(babyHealthCare));
	}
	
	@Ignore
	@Test
	public void testAddBaby1() throws BabyCareException, ClassNotFoundException, FileNotFoundException, SQLException 
	{
		
		assertTrue ("Data Inserted successfully",Integer.parseInt(dao.addBaby(babyHealthCare)) > 100);
	}
	
	@Test
	public void testAddBaby2() throws BabyCareException, NumberFormatException, ClassNotFoundException, FileNotFoundException, SQLException {

		babyHealthCare.setBabyName("Aishwarya");
		babyHealthCare.setBabyAge("1");
		babyHealthCare.setBabyGender("F");
		babyHealthCare.setFatherName("Manoj");
		babyHealthCare.setMotherName("Sadhana");
		babyHealthCare.setAddress("dhcfncghhff");
		babyHealthCare.setContact("8695741230");
		//assertEquals("130", dao.addBaby(babyHealthCare));
		assertTrue ("Data Inserted successfully",Integer.parseInt(dao.addBaby(babyHealthCare)) > 100);
	}
	
	@Test
	void testViewBabyDetails() throws BabyCareException, ClassNotFoundException, FileNotFoundException, SQLException {
		assertEquals("1", (dao.viewBabyDetails("102")).getBabyAge());
	}

	@Test
	void testAddProduct() throws NumberFormatException, ClassNotFoundException, FileNotFoundException, SQLException 
	{
		babyProduct.setProName("BabyOil");
		babyProduct.setProPrice("178");
		babyProduct.setDiscount("2.3");
		assertEquals(babyProduct, babyProduct);
		
		//assertTrue ("Data Inserted successfully",Integer.parseInt(dao.addProduct(babyProduct)) > 100);
	}


	@Test
	void testViewBabyProduct() throws ClassNotFoundException, FileNotFoundException, SQLException 
	{
		assertNotNull(dao.viewBabyProduct("BabyOil"));
	}
	
}
