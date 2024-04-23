package com.tester;

import java.util.Scanner;

import com.developer.geometry.Point2D;

class TestPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many points to plot?");
		Point2D[] pArray = new Point2D[sc.nextInt()];

		int choice;
		int count = 0;
		do {
			System.out.println("1. Plot a point");
			System.out.println("2. Display x, y coordinates of all points");
			System.out.println("0. Exit");
			System.out.println("\nEnter your choice");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter the index of point:");
				int index = sc.nextInt() - 1;
				if (index < count && index > pArray.length) {
					System.out.println("Index is out of bound");
				}
				if (pArray[index] != null) {
					System.out.println("index is alredy filled");
				} else {
					System.out.println("Enter x and y coordinates");
					pArray[index] = new Point2D(sc.nextInt(), sc.nextInt());
				}
				break;

			case 2:
				System.out.println("Display:");
				for (Point2D p : pArray) {
					if (p != null)
						System.out.println(p);
				}
				break;

			case 0:
				sc.close();
				System.out.println("Bye");
				break;

			}
		} while (choice != 0);
	}

}
