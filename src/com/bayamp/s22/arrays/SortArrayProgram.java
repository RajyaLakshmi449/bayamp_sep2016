package com.bayamp.s22.arrays;

import com.bayamp.s22.arrays.utils.ArrayUtils;

public class SortArrayProgram {

	public static void main(String[] args) {
		int[] myArray = {3,4,7,8,2,1,0};
		
		System.out.println("The array before sorting");
		ArrayUtils.printArray(myArray);
		
		int[] sortedArray = ArrayUtils.sort(myArray);
		
	}

}
