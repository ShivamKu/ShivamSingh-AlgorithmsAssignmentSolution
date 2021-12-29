package com.greatLearning.dsa.assignment.services;

public class MergeSortImplementation {
	public void conquerArray(double array[], int l, int m, int r) {
		int len1 = m - l +1;
		int len2 = r-m;
		
		double leftArr[] = new double[len1];
		double rightArr[] = new double[len2];
		
		for (int i=0;i<len1;i++) {
			leftArr[i] = array[l+i];
		}
		for(int j=0;j<len2;j++) {
			rightArr[j]= array[m+1+j];
		}
		
		int i=0,j=0,k=l;
		
		
		while(i<len1 && j<len2) {
			if(leftArr[i] <= rightArr[j]) {
				array[k] = leftArr[i];
				i++;
			}
			else {
				array[k] = rightArr[j];
				j++;
			}
			k++;
			
		}
		
		while(i<len1) {
			array[k]=leftArr[i];
			k++;
			i++;
		}
		
		while(j<len2) {
			array[k] = rightArr[j];
			k++;
			j++;
		}
	
	 	

	}
	
	// Main function that sorts array[left...right] using merge()

	public void sortArray(double array[], int l, int r) {

		 if (l<r) {
			 int mid = (l+r)/2;
			 sortArray(array,l,mid);
			 sortArray(array,mid+1,r);
			 
			 conquerArray(array,l,mid,r);
		 }

		

	}
}