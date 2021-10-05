package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

/*Exercice 4*/

public class Polyline {
	
	
	private int nbmax;
	private ArrayList<Point> PointPolyline;
	
	public Polyline(int nbmax) {
		this.nbmax =nbmax;
	}

	public void add(Point p) {
		if (PointPolyline.size() >= this.nbmax) {
			System.out.println("Nombre max atteint");
			}
		else {
			PointPolyline.add(p);
		}
	}
	
	
	/*public void AddPoint(Point p) {
		Point.add(p);
		}*/
	
	public int pointCapacity() {
		return nbmax;
	}
	
	public int nbPoints() {
		return this.PointPolyline.size();
	}

	public boolean contains(Point p) {
		for (Point point : this.PointPolyline) {
			if (point == p) {
				return true;
			}
		}
		return false;
		
	}

}
