package com.developer.geometry;

import java.util.Scanner;

public class Point2D {
	Scanner sc = new Scanner(System.in);
	private int x;
	private int y;

	public Point2D() {

	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String show() {
		return ("X: " + x + " Y: " + y);
	}

	public boolean isEqual(Point2D other) {
		return (this.x == other.x && this.y == other.y);

	}

	public void checkDef(Point2D other) {
		if (this.x == other.x && this.y == other.y)
			System.out.println("Same coordinates");
		else {
			double x1 = Math.pow(other.x - this.x, 2);
			double y1 = Math.pow(other.y - this.y, 2);
			double d = Math.sqrt(x1 + y1);
			System.out.println("Distance between 2 points are: " + d);

		}

	}

	public double calcdistance(Point2D other) {
		double x1 = Math.pow(other.x - this.x, 2);
		double y1 = Math.pow(other.y - this.y, 2);

		double d = Math.sqrt(x1 + y1);
		return d;
	}

	public void Accept() {
		System.out.println("Enter X co-ordinates:");
		x = sc.nextInt();
		System.out.println("Enter Y co-ordinates");
		y = sc.nextInt();

	}

	public void Display() {
		System.out.println("X:" + x);
		System.out.println("Y:" + y);
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	

}
