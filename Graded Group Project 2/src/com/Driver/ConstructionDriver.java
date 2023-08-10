package com.Driver;

import java.util.Scanner;

import com.construction.services.ConstructionSolver;
import com.construction.services.SimpleConstructionSolver;

public class ConstructionDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option_number;
		System.out.println("This is the construction site solving procedure.");
		System.out.println();
		
		do {
		System.out.println("Please enter the option number from the below so that it is clear which method you want to use :");
		System.out.println();
		System.out.println("1. This method assumes that the sizes of the floors are all distinct integers from 1 to N, where N is the number of floors in the building.");
		System.out.println("2. This method assumes that the sizes of the floors can be any N random distinct integers, where N is the number of floors in the building.");
		option_number=sc.nextInt();
		if(option_number!=1 && option_number!=2) {
			System.out.println("Invalid option selected.");
		}
		}while(option_number!=1 && option_number!=2);
		switch(option_number) {
		   case 1:
			System.out.println("You have chosen method 1. This assumes that the floor sizes are in the range from 1 to N both inclusive. N is the total number of floors.");
		    SimpleConstructionSolver.takeInputs();
			SimpleConstructionSolver.solve();
		    break;
		   case 2:
			   System.out.println("You have chosen method 2. Here the floor sizes can be any random distinct integers.");
			   ConstructionSolver.takeInputs();
		       ConstructionSolver.solve();
		
		}
        sc.close();
	}

}

