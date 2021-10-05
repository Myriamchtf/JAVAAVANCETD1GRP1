package fr.dauphine.javaavance.td1;

public class Circle {

	private final double radius;
	private final Point center;
	
	public Circle() {
		center = new Point(0,0);
		radius = 0;
	}
	
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
		
	}
	
	public Circle translate(int dx, int dy) {
		return new Circle(center.translate(dx,dy),radius);
	} 
	
	
	public double GetRadius() {
		return radius;

	}
	
	public Point GetCenter() {
		return center;

	}
	
	public double area() {
		return Math.PI * (radius * radius);
	
	}
	
	@Override
	public String toString() {
		return "Centre du cercle : " + this.center + "Radius du cercle : " + this.radius + " Aire du cercle :" 
				+ this.area() ;
		
	}
	
	public boolean contains(Point p) {
		
		double dist_p = Math.sqrt(Math.pow((p.getx()-center.getx()),2) + Math.pow((p.gety()-center.gety()),2) );
		if(dist_p<=radius) {
			return true;
		}
		return false;
	}
	
	public boolean contains(Point p, Circle[] circles) {
		
		for(Circle c : circles) {
			if(c.contains(p)) {
				return true;
			}
		}
		return false;
		
	}
		
}
