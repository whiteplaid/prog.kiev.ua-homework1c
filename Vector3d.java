package com.homework.vector;

public class Vector3d {
	private double x;
	private double y;
	private double z;
	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Vector3d() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public Vector3d addVector3d (Vector3d vector1, Vector3d vector2) {
		x = vector1.getX() + vector2.getX();
		y = vector1.getY() + vector2.getY();
		z = vector1.getZ() + vector2.getZ();
		return new Vector3d(x,y,z);
	}
	public double scalarMethod (Vector3d vector1, Vector3d vector2) {
		x = vector1.getX() * vector2.getX();
		y = vector1.getY() * vector2.getY();
		z = vector1.getZ() * vector2.getZ();
		return  x + y + z;
	}
	@Override
	public String toString() {
		return "Vector3d [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}
