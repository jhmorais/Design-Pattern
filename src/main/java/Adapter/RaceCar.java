package Adapter;

public class RaceCar extends Adapter {

	@Override
	public String accelerate() {
		return "Race car is running...";
	}

	@Override
	public String brake() {
		return "Race car is stopping...";
	}

	@Override
	public String handling() {
		return "Race car is turning...";
	}
}
