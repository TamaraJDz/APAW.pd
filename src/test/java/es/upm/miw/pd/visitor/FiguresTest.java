package es.upm.miw.pd.visitor;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FiguresTest {
	
	
	private List<Figure> figures;
	
	private VisitorMain manager;
	
	@Before
	public void setUp(){
		figures = new ArrayList<>();
		
		figures.add(new Circle(4));
		figures.add(new Circle(6));
		figures.add(new Square(5));
		figures.add(new Square(8.5));
		figures.add(new Triangle(3.5, 6));
		figures.add(new Triangle(4, 10.2));
		
		manager = new VisitorMain(figures);
	}
	
	@Test
	public void testTotalArea(){
		assertEquals(291.5128 ,manager.calculateArea(), 0.001);
	}
	
	@Test
	public void testTotalSides(){
		assertEquals(14, manager.calculateSides(), 0.001);
	}
}
