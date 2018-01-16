package Adapter;

public class ElectricCar extends Adapter {

	@Override
	public String accelerate() {
		return "Electric car is running...";
	}

	@Override
	public String brake() {
		return "Electric car is stopping...";
	}

	@Override
	public String handling() {
		return "Electric car is turning...";
	}

}
