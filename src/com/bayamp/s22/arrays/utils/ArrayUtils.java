package com.bayamp.s22.arrays.utils;

public class ArrayUtils {
	
	private ArrayUtils () {
		System.out.println("Default constructor is called");
	}
	public  static String printArray(int[] myArray){
		//Lets print the array
		String arrayAsString1 = new String("{");

		for(int i=0;i<myArray.length;i++){
			arrayAsString1 = arrayAsString1+myArray[i]+",";
		}
		
		arrayAsString1 = arrayAsString1 + "}";
		
		arrayAsString1 = arrayAsString1.replaceAll(",}", "}");
		
		return arrayAsString1;
	}
	
	public static String printArray(char[] myArray){
		//Lets print the array
		String arrayAsString1 = new String("{");

		for(int i=0;i<myArray.length;i++){
			arrayAsString1 = arrayAsString1+myArray[i]+",";
		}
		
		arrayAsString1 = arrayAsString1 + "}";
		
		arrayAsString1 = arrayAsString1.replaceAll(",}", "}");
		
		//System.out.println("The array is :"+ arrayAsString1);
		
		return arrayAsString1;
	}
	
	public static int[] sort(int[] myArray){
		
		return null;
	}
	
	public static int[] mergeArrays(int[] array1,int[] array2){
		
		return null;
	}
	
	public static boolean linearSearch(int[] myArray,int elementToSearch) {
		
		return false;
	}
	
	public static int linearSearchToGetIndex(int[] myArray,int elementToSearch) {
		
		return 0;
	}

}
