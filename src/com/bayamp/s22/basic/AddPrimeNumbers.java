package com.bayamp.s22.basic;

import com.bayamp.s22.basic.utils.PrimeNumber;

public class AddPrimeNumbers {

	public static void main(String[] args) {
		
		int firstNumber = 12;
		int secondNumber = 14;
		
		boolean result1 = PrimeNumber.isPrime(firstNumber);
		boolean result2 = PrimeNumber.isPrime(secondNumber);
		if (result1 == true && result2 == true) {
			int total = com.bayamp.s22.basic.utils.Addition.addTwoNumbers(firstNumber, secondNumber);
		}

	}

}
