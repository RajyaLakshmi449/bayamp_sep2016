package com.bayamp.s22.arrays;

import com.bayamp.s22.arrays.utils.ArrayUtils;

public class DoubleDimensionArray {

	public static void main(String[] args) {
	
		int[][] arrays = { {1,2,3,4,5,6},{10,11,12,13,14,15}};
		
		for(int i=0;i<arrays.length;i++){
			int[] temp = arrays[i];
			ArrayUtils.printArray(temp);
		}
		

	}

}
