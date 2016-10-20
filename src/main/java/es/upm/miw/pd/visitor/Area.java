package es.upm.miw.pd.visitor;

public class Area extends Visitor {

	private double area;
	
    @Override
    public void visitCircle(Circle e) {
    	area += Math.PI * e.getRadius() * e.getRadius();
    }

    @Override
    public void visitTriangle(Triangle e) {
    	area += (e.getBase() * e.getHeight()) / 2;
    }

    @Override
    public void visitSquare(Square e) {
    	area += e.getSide() * e.getSide();
    }
    
    public double getArea(){
    	return area;
    }
}
