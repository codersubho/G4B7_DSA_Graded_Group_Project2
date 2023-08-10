package com.construction.services;

import java.util.PriorityQueue;

import java.util.Scanner;

public class ConstructionSolver {

	static Scanner sc;
	static int input[];

	public static void solve() {
		System.out.println("The order of construction is as follows :");
		PriorityQueue<FloorTiles> pr = new PriorityQueue<FloorTiles>(input.length, new FloorTilesComparator());
		for (int i = 0; i < input.length; i++) {
			FloorTiles ft = new FloorTiles(input[i], i + 1);
			pr.add(ft);
		}
		int day = 1;
		while (day <= input.length) {  // we are not checking here if the queue is empty or not becoz we know that queue will be empty at the last day

			if (day == pr.peek().day) {
				System.out.println("Day: " + day);
				while (!pr.isEmpty() && day >= pr.peek().day) {
					System.out.print(pr.poll().size + " ");
				}
				System.out.println();

			} else {
				System.out.println("Day: " + day);
				System.out.println();
			}
			day++;

		}

	}

	public static void takeInputs() {
		int arr[];
		int size, val;
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
		arr[0] = 0;
		int i = 1;

		while (i <= size) {
			int j = 0;
			System.out.println("Enter the floor size given on day: " + i);
			System.out.println();
			val = sc.nextInt();
			if (val == 0) {
				System.out.println("Floor size cannot be zero");
				continue;
			}
			while (j < size && val < arr[j++])
				;

			if (j == size) {
				input[i - 1] = val;
				break;
			}

			if (val > arr[j - 1]) {
				arr[j] = arr[j - 1];
				arr[j - 1] = val;

			} else {
				System.out.println("Floor size must be distinct. A floor of size " + val + " is already there. Please give some other value");
				System.out.println();

				continue;
			}
			input[i - 1] = val;
			i++;

		}
	}
}
