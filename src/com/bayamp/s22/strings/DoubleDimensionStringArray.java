package com.bayamp.s22.strings;

public class DoubleDimensionStringArray {

	public static void main(String[] args) {
		
		String company1 = new String("apple");
		
		System.out.println("The company is :" + company1.toString());
		
		String[] topCompanies = {company1,"face book","cisco","hpe","bayamp"};
		String[] bottomCompanies = {"company1","company2","company3","company4"};
		
		String[][] allCompanies = { topCompanies,bottomCompanies};
		
		for(String[] companies:allCompanies){
			
			for(String company:companies){
				System.out.println("The company is :" + company);
			}
		}
		
		
		}


}
