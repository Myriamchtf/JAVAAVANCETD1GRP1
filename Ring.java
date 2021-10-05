package fr.dauphine.javaavance.td1;

public class Ring extends Circle {
	
	private final int radius2; 

	public Ring() {
		// TODO Auto-generated constructor stub
		super();
		radius2 = 2;
		
	}
	
	/* le inner radius est plus petit que le outer*/ 
	
	public Ring(Point p, int r1, int r2) {
		super(p,r1);
		if(this.GetRadius()<r2) {
			radius2 = r2;
		}
		else {
			throw new IllegalArgumentException("Radius1 doit être plus petit que Radius2");
		}
	}
	
	public int getRadius2() {
		return radius2;
	}
	

	public boolean contains(Point p) {
		return new Circle(this.GetCenter(),radius2).contains(p);
	}
	
	public boolean contains(Point p, Ring[] rings) {
		for(Ring r : rings) {
			if(r.contains(p)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) 
			return false;
		if(this==obj) 
			return true;
		if(!(obj instanceof Ring)) 
			return false;
		Ring r = (Ring) obj;
		return r.getRadius2()== radius2;
	}
	
	@Override
	public String toString() {
		return super.toString() + " (radius2 =" + radius2 + ")";
	}

}
