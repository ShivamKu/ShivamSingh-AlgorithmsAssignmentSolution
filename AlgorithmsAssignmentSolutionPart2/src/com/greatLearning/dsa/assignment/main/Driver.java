package com.greatLearning.dsa.assignment.main;

import com.greatLearning.dsa.assignment.services.MergeSortImplementation;
import com.greatLearning.dsa.assignment.services.AddedServices;
import com.greatLearning.dsa.assignment.services.BinarySearch;
import com.greatLearning.dsa.assignment.services.LinearSearch;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfCompanies;
		int option;
		
		System.out.println("Enter the Number Of Companies:");
		Scanner sc = new Scanner(System.in);
		noOfCompanies = sc.nextInt();
		
		double[] priceArray = new double[noOfCompanies];
		boolean[] profitArray = new boolean[noOfCompanies];
		
		for(int i=0;i<noOfCompanies;i++) {
			System.out.println("Enter the Current Stock Price of the Company "+(i+1) + ":");
			priceArray[i] = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			profitArray[i] = sc.nextBoolean();
		}
		
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		mergeSortImplementation.sortArray(priceArray, 0, noOfCompanies-1);
		
		AddedServices addon = new AddedServices();
		
		BinarySearch bs = new BinarySearch();
		
		LinearSearch ls = new LinearSearch();
		
		do {
			System.out.println("\n-----------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("-----------------------------------------------");
			
			option = sc.nextInt();
			
			switch(option) {
			case 0:{
				System.out.println("Exited Successfully");
				break;
				}
			case 1:{
				addon.displayPricesAscendingOrder(priceArray);
				break;
				}
			case 2:{
				addon.displayPricesDescendingOrder(priceArray);
				break;
				}
			case 3:{
				System.out.println("Total no of companies whose stock price rose today : "
										+ls.companiesInProfit(profitArray));
				break;
				}
			case 4:{
				System.out.println("Total no of companies whose stock price declined today : "
						+(noOfCompanies - ls.companiesInProfit(profitArray)));
				break;
				}
			case 5:{
				System.out.println("Enter the Key Value");
				double key = sc.nextDouble();
				bs.searchValue(priceArray, key);
				break;
				}
			default :{
				System.out.println("Invalid Option Selected! Enter Valid Option");
				}
			}
			
		}while(option!=0);
		sc.close();
		
	}

}
