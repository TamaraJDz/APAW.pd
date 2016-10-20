package es.upm.miw.pd.visitor;

import java.util.ArrayList;
import java.util.List;

public final class VisitorMain {
	
	private List<Figure> figures;

	public VisitorMain(List<Figure> figures) {
		this.figures = new ArrayList<>();
		
		for(Figure f : figures)
			this.figures.add(f);
	}

	public double calculateArea() {
		Area area = new Area();
		
		for (Figure elemento : figures) {
			elemento.accept(area);
		}
		return area.getArea();
	}
	
	public double calculateSides() {
		NumberOfSides sides = new NumberOfSides();
		
		for (Figure elemento : figures) {
			elemento.accept(sides);
		}
		return sides.getSides();
	}

}
