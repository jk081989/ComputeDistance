package com.mbcc.distance;

public class Point3D extends Point {

	protected int z;

	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	int distance(int p1, int p2, int p3) {
		int dx = this.x - p1;
		int dy = this.y - p2;
		int dz = this.z - p3;
		return (int) Math.sqrt(dx * dx + dy * dy + dz * dz);
	}

	int distance(Point3D p) {
		return distance(p.x, p.y, p.z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(3, 5);
		Point p2 = new Point(6, 2);
		Point p3 = new Point3D(2, 3, 4);
		Point p4 = new Point3D(5, 3, 7);
		int d0 = p1.distance(0, 0);
		System.out.println("Distance from p1 to origin: " + d0);
		int d1 = p1.distance(p2);
		System.out.println("Distance from p2 to p1: " + d1);
		System.out.println("Distance from p3 to p4: " + p4.distance(p3));
		System.out.println("Distance from p1 to p3: " + p3.distance(p1));

		// System.out.println("Distance between them is: "+Point3D.distance(p1,p2,p3));
//		Point p3 = new Point3D(1, 3, 6);
		// Point p4 = new Point3D(2, 3, 4);

	}

}
