package com.complete_bst.services;

public class BinarySearchTree {
	BinaryNode root;
	boolean insert(int data) {
		BinaryNode n = new BinaryNode(data);
		if (root == null) {
			root = n;
			return true;
		}
		BinaryNode temp = root;
		do {
			if (data == temp.data) {
				System.out.println("Data already present");
				return false;

			} else {
				if (data < temp.data) {
					if (temp.left != null) {
						
						temp = temp.left;
						
					} else {
						temp.left = n;
						return true;
					}
				} else {
					if (temp.right != null) {
						temp = temp.right;
					} else {
						temp.right = n;
						return true;
					}
				}
			}
		} while (true);
		
	}

	void insertIntArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			insert(arr[i]);
		}
	}

	BinaryNode search(int data) {
		
		if (root == null) {
			System.out.println("Empty Binary Search tree");
			return root;
		}
		BinaryNode temp = root;
		while (temp != null) {
			if (data == temp.data) {
				return temp;
			} else if (data < temp.data) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}

		}
		return temp;
	}

	


}
