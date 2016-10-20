package es.upm.miw.pd.visitor;

public class Triangle extends Figure {
	
	private double base;
	
	private double height;

	public Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	public double getBase(){
		return base;
	}
	
	public double getHeight(){
		return height;
	}
	
    public void accept(Area area) {
        area.visitTriangle(this);
    }
    
    public void accept(NumberOfSides sides) {
        sides.visitTriangle(this);
    }

    public int getSides(){
    	return 3;
    }
}
