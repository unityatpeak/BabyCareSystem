package com.cg.babycare.dao;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import com.cg.babycare.bean.BabyHealthCare;
import com.cg.babycare.bean.BabyProduct;
import com.cg.babycare.exception.BabyCareException;
public interface IBabyDao 
{
public String addBaby(BabyHealthCare baby) throws  BabyCareException, ClassNotFoundException, FileNotFoundException, SQLException;
	
	public BabyHealthCare viewBabyDetails(String babyId) throws BabyCareException, ClassNotFoundException, FileNotFoundException, SQLException;
	
	public String addProduct(BabyProduct babyProduct ) throws ClassNotFoundException, FileNotFoundException, SQLException;
	
	public BabyProduct viewBabyProduct(String proName) throws ClassNotFoundException, FileNotFoundException, SQLException;
	
}
