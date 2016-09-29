package com.bayamp.s22.basic.utils;

public class PrimeNumber {
	
	public static boolean isPrime(int number) {
		for (int i = 2; i < 10; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
