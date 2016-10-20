package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumbersManagerTest {
	
		NumbersManager numbersManager;
		
		CreatorNumber creatorNumber;
		
		
		@Before
		public void setUp(){
			numbersManager = new NumbersManager();
		}
		
		@Test
		public void testNaturalNumberEs(){
			creatorNumber = new CreatorNumberEs();
			numbersManager.setCreator(creatorNumber);
			numbersManager.createNaturalNumber(0);
			assertEquals(0, new NaturalNumberEs(0).getValue());
	        assertEquals("cero", new NaturalNumberEs(0).getTextValue());
	        
			numbersManager.createNaturalNumber(1);
			assertEquals(1, new NaturalNumberEs(1).getValue());
	        assertEquals("uno", new NaturalNumberEs(1).getTextValue());
		}
		
		@Test
		public void testNaturalNumberEn(){
			creatorNumber = new CreatorNumberEn();
			numbersManager.setCreator(creatorNumber);
			numbersManager.createNaturalNumber(2);
			assertEquals(2, new NaturalNumberEn(2).getValue());
	        assertEquals("two", new NaturalNumberEn(2).getTextValue());
	        
			numbersManager.createNaturalNumber(3);
			assertEquals(3, new NaturalNumberEn(3).getValue());
	        assertEquals("three", new NaturalNumberEn(3).getTextValue());
		}
		
		@Test
		public void testNaturalNumberFr(){
			creatorNumber = new CreatorNumberFr();
			numbersManager.setCreator(creatorNumber);
			numbersManager.createNaturalNumber(4);
			assertEquals(4, new NaturalNumberFr(4).getValue());
	        assertEquals("quatre", new NaturalNumberFr(4).getTextValue());
	        
			numbersManager.createNaturalNumber(5);
			assertEquals(5, new NaturalNumberFr(5).getValue());
	        assertEquals("cinq", new NaturalNumberFr(5).getTextValue());
	        
	        numbersManager.createNaturalNumber(6);
			assertEquals(6, new NaturalNumberFr(6).getValue());
	        assertEquals("???", new NaturalNumberFr(6).getTextValue());
		}
}
