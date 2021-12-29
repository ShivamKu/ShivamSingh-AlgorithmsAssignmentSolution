package com.greatLearning.dsa.assignment.services;

public class LinearSearch {
	public int companiesInProfit(boolean arr[]){
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == true) {
				count++;
			}
		}
		
		return count;
	}

}
