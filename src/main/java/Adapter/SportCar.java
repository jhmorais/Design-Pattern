package Adapter;

public class SportCar extends Adapter {

	@Override
	public String accelerate() {
		return "Sport car is running...";
	}

	@Override
	public String brake() {
		return "Sport car is stopping...";
	}

	@Override
	public String handling() {
		return "Sport car is turning...";
	}
}
