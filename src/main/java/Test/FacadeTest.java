package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Facade.WashCarFacade;

public class FacadeTest {
	
	WashCarFacade washCar;
	
	@Before
	public void initialize() {
		washCar = new WashCarFacade();
	}
	
	@Test
	public void testWashCar() {
		System.out.println(washCar.washTheCar());
		assertEquals("Shower started rinse\n" + 
					"Shower ends rinse\n" + 
					"Soap started lathering\n" + 
					"Soap ends lathering\n" + 
					"Bush started rub\n" + 
					"Bush ends rub\n" + 
					"Shower started rinse\n" + 
					"Shower ends rinse\n", washCar.washTheCar());
	}

}
