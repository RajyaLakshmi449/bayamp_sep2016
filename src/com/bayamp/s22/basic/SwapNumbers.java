package com.bayamp.s22.basic;

import com.bayamp.s22.basic.utils.PrimeNumber;

public class SwapNumbers {

	public static void main(String[] args) {
		swapTwoNumbers();
	}

	private static void swapTwoNumbers() {
		int a = 20;
		int b = 30;
		boolean result1 = PrimeNumber.isPrime(a);
		boolean result2 = PrimeNumber.isPrime(b);
		if (result1 == true && result2 == true) {
			System.out.println("Numbers before swapping :" + a + "," + b);
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("Numbers after swapping :" + a + "," + b);
		}
	}

}
