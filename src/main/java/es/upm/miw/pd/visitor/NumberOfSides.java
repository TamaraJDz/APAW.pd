package es.upm.miw.pd.visitor;

public class NumberOfSides extends Visitor {

	private int sides;
	
    @Override
    public void visitCircle(Circle e) {
        sides = sides + e.getSides();
    }

    @Override
    public void visitSquare(Square e) {
        sides = sides + e.getSides();
    }

    @Override
    public void visitTriangle(Triangle e) {
        sides = sides + e.getSides();
    }
    
    public int getSides(){
    	return sides;
    }

}
