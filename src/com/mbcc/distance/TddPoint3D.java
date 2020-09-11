package com.mbcc.distance;

public class TddPoint3D extends TddPoint {

	protected double z;

	public TddPoint3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	double distance(TddPoint3D p3d) {
		double disx = p3d.x - this.x;
		double disy = p3d.y - this.y;
		double disz = p3d.z - this.z;
		return (double) Math.sqrt(disx * disx + disy * disy + disz * disz);	
	}

	/*double distance(double p1, double p2, double p3) {
		double disx = this.x - p1;
		double disy = this.y - p2;
		double disz = this.z - p3;
		return (double) Math.sqrt(disx * disx + disy * disy + disz * disz);
	}
*/
	/*double distance(TddPoint3D p) {
		return distance(p.x, p.y, p.z);
	}*/

}
