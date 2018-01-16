package Adapter;

public class Adapter implements Car{

	public String accelerate(Adapter element) {
		return element.accelerate();
	}

	public String brake(Adapter element) {
		return element.brake();
	}

	public String handling(Adapter element) {
		return element.handling();
	}
	
	public String accelerate() {
		return "";
	}
	
	public String brake() {
		return "";
	}

	public String handling() {
		return "";
	}

}
