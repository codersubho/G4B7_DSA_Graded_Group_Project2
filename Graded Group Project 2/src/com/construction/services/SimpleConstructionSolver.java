package com.construction.services;

import java.util.Scanner;

public class SimpleConstructionSolver {
	static Scanner sc;
	static int input[];

	public static void solve() {
		int arr[] = new int[input.length];
		int max1 = input.length;
		System.out.println("The order of construction is as follows :");
		int i = 0;
		while (i < input.length) {
			System.out.println("Day: " + (i + 1));
			if (input[i] == max1) {
				System.out.print(max1 + " ");
				max1--;
				while (max1 > 0 && arr[max1 - 1] == max1) {
					System.out.print(max1 + " ");
					max1--;
				}
			} else {

				arr[input[i] - 1] = input[i];
			}
			i++;
			System.out.println();
		}
	}

	public static void takeInputs() {
		int arr[];
		int size;
		sc = new Scanner(System.in);
		boolean flag = false;
		do {
			if (flag) {
				System.out.println("Total number of floors cannot be zero");
			}
			System.out.println("Enter the total number of floors in the building ");
			size = sc.nextInt();
			if (size == 0) {
				flag = true;
			}
		} while (size == 0);
		input = new int[size];
		arr = new int[size];
		int val;
		for (int i = 1; i <= size; i++) {
			System.out.println("Enter the floor size given on day: " + i);
			val = sc.nextInt();
			if (0 < val && val <= size) {
				if(arr[val-1]==0) {
				input[i - 1] = val;
				arr[val-1]=val;
				}else {
					System.out.println("Floor size must be distinct. A floor of size " + val + " is already there. Please give some other value");
					i--;
				}
			}else {
				System.out.println("Floor size must be from the range 1 to "+size);
				i--;
			}
		}
	}

}
