package es.upm.miw.pd.visitor;

public abstract class Figure {
    public abstract void accept(Area area);
    
    public abstract void accept(NumberOfSides sides);
}
