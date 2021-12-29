package com.greatLearning.dsa.assignment.services;

public class BinarySearch {
	public void searchValue(double arr[], double key) {
		int low=0; //starting end of searching portion of array
		int high = arr.length-1; //last element of searching portion of array
		int mid = (low+high)/2;
		
		while(low<=high) {
			//starting point should be less than or equal to ending point
			if(key < arr[mid]) {
				high = mid-1; //array is sorted so key if present will be in the left portion of array
			}
			
			else if(key>arr[mid]) {
				low = mid+1; //key if present will be in the right portion of the array
			}
			
			else {//key=arr[mid]
				System.out.println("Stock of Value " + key +" is present.");
				break;
			}
			
			mid = (low+high)/2;
		}
		
		if(low>high) {
			System.out.println("Stock value NOT FOUND!");
		}
	}

}
