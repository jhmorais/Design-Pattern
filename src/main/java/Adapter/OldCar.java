package Adapter;

public class OldCar extends Adapter {

	@Override
	public String accelerate() {
		return "Old car is running...";
	}

	@Override
	public String brake() {
		return "Old car is stopping...";
	}

	@Override
	public String handling() {
		return "Old car is turning...";
	}
}
