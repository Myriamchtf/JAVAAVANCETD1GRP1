package fr.dauphine.javaavance.td1;
import java.util.ArrayList;

public class Point {

		private int x;
		private int y;
		private int p2;
		
	    static ArrayList<Point> list = new ArrayList<>();

	   
		public static void methode1() {
		
			
			Point p=new Point();
			/*System.out.println(p.toString());
			
			Point p2 = p;
			System.out.println(p2);*/
			
			Point p1=new Point(1,2);
		    Point p2=p;
		    Point p3=new Point(1,2);

		    System.out.println(p1==p2);
		    System.out.println(p1==p3);
		    
		    System.out.println(p1.IsSameAs(p2));
		    System.out.println(p1.IsSameAs(p3));
		    

		    list.add(p1);
		    list.add(p2);
		    list.add(p3);

		    System.out.println(list.indexOf(p2));
		    System.out.println(list.indexOf(p3));
		   
		}
		
		public int getx() {
			return x;
		}
		

		public void sety(int y) {
			this.y = y;
		}

		
		public Point() {
			
		}
		
		Point(int x, int y) {
			
			this.x = x;
			this.y = y;
		}
	
		Point(int p2){
			this.setP2(p2);

		}
		
		/*Point(Point p2){
			this.y = p.y;
		}*/
		
		public String toString() {
			
			return "("+x+", "+y+")";
			
			}
		
		public int getP2() {
			return p2;
		}

		public void setP2(int p2) {
			this.p2 = p2;
		}
		
		/*Exercice 3*/
		
		public boolean IsSameAs(Point p) {
			return (this.x==p.x) && (this.y==p.y);
			
		}

		public Point translate(int dx, int dy) {
			// TODO Auto-generated method stub
			return new Point(x+ dx, y+dy);
		}

		public int gety() {
			// TODO Auto-generated method stub
			return y;
		}	
}
