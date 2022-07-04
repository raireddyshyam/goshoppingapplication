package com.tnsif.framework;

public class NormalAcc extends ShopAcc
{
	public float deliverycharges;
	
	public NormalAcc(int accNo, String accName, float charges, float deliverycharges) {
		super(accNo, accName, charges);
		this.deliverycharges = deliverycharges;
	}
	
	public void bookProduct(float charges)
	{
		
	}

	@Override
	public String toString() {
		return "NormalAcc [deliverycharges=" + deliverycharges + ", accNo=" + accNo + ", accName=" + accName
				+ ", charges=" + charges + "]";
	}

	public static void main(String[] args) {

	}

}
