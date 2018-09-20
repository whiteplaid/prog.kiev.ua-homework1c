package com.homework.vector;

public class Main {
	public static void main(String[] args) {
		Vector3d v1 = new Vector3d(3,4,5);
		Vector3d v2 = new Vector3d(5,6,7);
		Vector3d v3 = new Vector3d();
		System.out.println("Scalar Method:" + " " + v3.scalarMethod(v1,v2));
		System.out.println(v3.addVector3d(v1, v2).toString());
	}
}
