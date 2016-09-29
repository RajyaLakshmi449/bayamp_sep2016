package com.bayamp.s22.basic.utils;

import com.bayamp.s22.objects.OddData;

public class Addition {
	
	//GLOBAL VARIABLES
	
	private Addition(){
	
	}
	
	//METHODS

	public static int addTwoNumbers(int num1,int num2) {
		int total = num1 + num2;
		return num1 + num2;
	}
	
	/*
	 * method to add only odd numbers
	 */
	public  static int addTwoOddNumbers(int num1,int num2) {
		//TO DO
		//Write logic to check if num1 and num2 are odd numbers
	
		boolean check1 = isOddNumber(num1);
		boolean check2 = isOddNumber(num2);
		
		if( check1 && check2) {
			int total = num1 + num2;
		}
		
		return num1 + num2;
	}

	public static int addTwoNumbers(int[] array) {
		int total = 0;
		
	/*	for(int i:array){
			total = total + i;
		}*/
		
		for(int i=0;i<array.length;i++){
			total = total + array[i];
		}
		
		return total;
	}
	
	public static int addOddNumber(OddData data){
	
		return data.getNumber1() + data.getNumber2();
		
	}
	
	private static boolean isOddNumber(int number){
		//will do some thing with number (ex: 20)...
		
		return false;
	}
	
}
