package es.upm.miw.pd.visitor;

public class Circle extends Figure {
	private double radius;

	public Circle(float radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
    public void accept(Area area) {
        area.visitCircle(this);
    }
    
    public void accept(NumberOfSides sides) {
        sides.visitCircle(this);
    }

    public int getSides(){
    	return 0;
    }
}
