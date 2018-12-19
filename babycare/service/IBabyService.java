package com.cg.babycare.service;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import com.cg.babycare.bean.BabyHealthCare;
import com.cg.babycare.bean.BabyProduct;
import com.cg.babycare.exception.BabyCareException;

public interface IBabyService 
{
public String addBaby(BabyHealthCare baby) throws ClassNotFoundException, FileNotFoundException, BabyCareException, SQLException;
	
	public BabyHealthCare viewBabyDetails(String babyId) throws ClassNotFoundException, FileNotFoundException, BabyCareException, SQLException;
	
	public String addProduct(BabyProduct babyProduct ) throws ClassNotFoundException, FileNotFoundException, SQLException;
	
	public BabyProduct viewBabyProduct(String proName) throws ClassNotFoundException, FileNotFoundException, SQLException;
	
	
}
