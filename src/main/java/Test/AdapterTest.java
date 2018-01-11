package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Adapter.Adapter;

public class AdapterTest {
	
	Adapter adapter;
	
	@Before
	public void initialize() {
		adapter = new Adapter();
	}
	
	@Test
	public void testOldCar() {
		assertEquals("Old car is running...", adapter.accelerate("Old"));
		assertEquals("Old car is stopping...", adapter.brake("Old"));
		assertEquals("Old car is turning...", adapter.handling("Old"));
	}
	
	@Test
	public void testRaceCar() {
		assertEquals("Race car is running...", adapter.accelerate("Race"));
		assertEquals("Race car is stopping...", adapter.brake("Race"));
		assertEquals("Race car is turning...", adapter.handling("Race"));
	}
	
	@Test
	public void testSportCar() {
		assertEquals("Sport car is running...", adapter.accelerate("Sport"));
		assertEquals("Sport car is stopping...", adapter.brake("Sport"));
		assertEquals("Sport car is turning...", adapter.handling("Sport"));
	}
	
	@Test
	public void testElectricCar() {
		assertEquals("Electric car is running...", adapter.accelerate("Electric"));
		assertEquals("Electric car is stopping...", adapter.brake("Electric"));
		assertEquals("Electric car is turning...", adapter.handling("Electric"));
	}
}
