package Facade;

public class ActionWashCar {
	
	String name, action;
	
	public String initiate(ActionWashCar element) {
		return element.name + " started " + element.action + "\n";
	}
	
	public String finalize(ActionWashCar element) {
		return element.name + " ends " + element.action + "\n";
	}
	
	
}
