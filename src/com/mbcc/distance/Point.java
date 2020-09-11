package com.mbcc.distance;

public class Point {
	protected int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int distance(int p1,int p2)
	{
		int dx= this.x- p1;
		int dy = this.y-p2;
		return (int)Math.sqrt(dx*dx + dy*dy);		
	}
	int distance(Point p)
	{
		return distance(p.x,p.y);
	}

}
