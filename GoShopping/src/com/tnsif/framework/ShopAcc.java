package com.tnsif.framework;

abstract public class ShopAcc 
{
	public int accNo;
	public String accName;
	public float charges;
	
	public ShopAcc(int accNo, String accName, float charges) 
	{
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.charges = charges;
	}
	
	public void bookProduct()
	{
		
	}
	
	public void items()
	{
		
	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accName=" + accName + ", charges=" + charges + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args)
	{
		

	}

}
