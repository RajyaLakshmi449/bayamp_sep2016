package com.bayamp.s22.objects;

public class OddData {
	
	//Data Members (GLOBAL VARIABLES)
	private int number1;
	private int number2;
	
	
	//METHODS
	public OddData() {
		System.out.println("This is my default construtor");
	}

	public OddData(int num1,int num2){
		number1 = num1;
		number2 = num2;
	}
	
	public int getNumber1(){
		return this.number1;
	}
	
	public int getNumber2(){
		return this.number2;
	}
	
}
