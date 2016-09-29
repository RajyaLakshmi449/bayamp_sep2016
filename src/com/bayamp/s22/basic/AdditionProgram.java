package com.bayamp.s22.basic;

import com.bayamp.s22.basic.utils.Addition;
import com.bayamp.s22.objects.OddData;

public class AdditionProgram {
	//GLOBAL VARIABLES
	
	//METHODS
	public static void main(Addition[] args) {
		//int[] myNumbers = {10,3,4,1,2};

	

		OddData data1 = new OddData(5,7);
		int total = Addition.addOddNumber(data1);
		

		OddData data2 = new OddData();
		System.out.println("The total is :" + total);
		
	}

}
