package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Adapter.Adapter;
import Adapter.ElectricCar;
import Adapter.OldCar;
import Adapter.RaceCar;
import Adapter.SportCar;

public class AdapterTest {
	
	Adapter adapter;
	
	@Before
	public void initialize() {
		adapter = new Adapter();
	}
	
	@Test
	public void testOldCar() {
		assertEquals("Old car is running...", adapter.accelerate(new OldCar()));
		assertEquals("Old car is stopping...", adapter.brake(new OldCar()));
		assertEquals("Old car is turning...", adapter.handling(new OldCar()));
	}
	
	@Test
	public void testRaceCar() {
		assertEquals("Race car is running...", adapter.accelerate(new RaceCar()));
		assertEquals("Race car is stopping...", adapter.brake(new RaceCar()));
		assertEquals("Race car is turning...", adapter.handling(new RaceCar()));
	}
	
	@Test
	public void testSportCar() {
		assertEquals("Sport car is running...", adapter.accelerate(new SportCar()));
		assertEquals("Sport car is stopping...", adapter.brake(new SportCar()));
		assertEquals("Sport car is turning...", adapter.handling(new SportCar()));
	}
	
	@Test
	public void testElectricCar() {
		assertEquals("Electric car is running...", adapter.accelerate(new ElectricCar()));
		assertEquals("Electric car is stopping...", adapter.brake(new ElectricCar()));
		assertEquals("Electric car is turning...", adapter.handling(new ElectricCar()));
	}
}
