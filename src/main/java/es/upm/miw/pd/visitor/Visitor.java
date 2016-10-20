package es.upm.miw.pd.visitor;

public abstract class Visitor {
    public abstract void visitCircle(Circle e);

    public abstract void visitSquare(Square e);
    
    public abstract void visitTriangle(Triangle e);
}
