package com.tnsif.applicationpart;

import com.tnsif.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	public final float charges=0;
	
	public GSPrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges, isPrime);
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Dear prime user your product charges are"+charges);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [charges=" + charges + ", isPrime=" + isPrime + ", accNo=" + accNo + ", accName=" + accName
				+ "]";
	}
	


    
    		

}
