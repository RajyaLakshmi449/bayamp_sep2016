package com.bayamp.s22.strings;

import com.bayamp.s22.arrays.utils.ArrayUtils;

public class StringCharProgram {

	public static void main(String[] args) {
		String topCompanyInBayArea = new String("BayAmp Technologies");
		
		char[] allChars = topCompanyInBayArea.toCharArray();
		
		String result = ArrayUtils.printArray(allChars);
		System.out.println("");

	}

}
