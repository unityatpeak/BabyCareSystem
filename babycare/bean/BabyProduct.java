package com.cg.babycare.bean;

public class BabyProduct 
{

    String proName;
    String proId;
    String proPrice;
    String discount;
    
    
    
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProPrice() {
		return proPrice;
	}
	public void setProPrice(String proPrice) {
		this.proPrice = proPrice;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "BabyProduct [proName=" + proName + ", proId=" + proId + ", proPrice=" + proPrice + ", discount="
				+ discount + "]";
	}
    
    
}
