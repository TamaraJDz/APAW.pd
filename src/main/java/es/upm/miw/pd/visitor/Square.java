package es.upm.miw.pd.visitor;

public class Square extends Figure {
	
	private double side;

	public Square(double side){
		this.side = side;
	}
	
	public double getSide(){
		return side;
	}
	
    public void accept(Area area) {
        area.visitSquare(this);
    }
    
    public void accept(NumberOfSides sides) {
        sides.visitSquare(this);
    }

    public int getSides(){
    	return 4;
    }
}
