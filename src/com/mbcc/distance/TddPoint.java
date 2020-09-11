package com.mbcc.distance;

public class TddPoint {

	double x, y;

	public TddPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distance(TddPoint p) {
		double dx = p.x - this.x;
		double dy = p.y - this.y;
		return (double) Math.sqrt(dx * dx + dy * dy);
	}
	/*public double distance(double p1, double p2, TddPoint p) {
		double dx = this.x - p1;
		double dy = this.y - p2;
		return (double) Math.sqrt(dx * dx + dy * dy);
	}*/

	/*double distance(TddPoint p) {
		return distance(p.x, p.y);
	}*/

}
