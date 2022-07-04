package com.tnsif.main;

import com.tnsif.applicationpart.GSNormalAcc;
import com.tnsif.applicationpart.GSPrimeAcc;
import com.tnsif.applicationpart.GSShopFactory;

public class Client {

	public static void main(String[] args) 
	{
		//step A
		GSShopFactory gssfactory=new GSShopFactory();
		gssfactory.getNewNormalAccount(101, "shyam", 10000, 50);
		gssfactory.getNewPrimeAccount(102, "manu", 5000, true);
		
		//step B 
		GSPrimeAcc gsprime=new GSPrimeAcc(102,"manu",5000,true);
		
		//step C 
		GSNormalAcc gsnormal=new GSNormalAcc(101,"shyam", 10000,50);
		
		//step D
		gsprime.bookProduct(5000);
		gsnormal.bookProduct(10000);
		
		//step E
		gsprime.toString();
		gsnormal.toString();

	}

}
