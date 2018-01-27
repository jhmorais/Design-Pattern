package Facade;

public class WashCarFacade {
	
	public ActionWashCar actionWashCar;
	
	public WashCarFacade() {
		actionWashCar = new ActionWashCar();
	}
	
	public String washTheCar() {
		StringBuilder steps = new StringBuilder();
		
		steps.append(actionWashCar.initiate(new Shower()));
		steps.append(actionWashCar.finalize(new Shower()));
		
		steps.append(actionWashCar.initiate(new Soap()));
		steps.append(actionWashCar.finalize(new Soap()));
		
		steps.append(actionWashCar.initiate(new Bush()));
		steps.append(actionWashCar.finalize(new Bush()));

		steps.append(actionWashCar.initiate(new Shower()));
		steps.append(actionWashCar.finalize(new Shower()));
		
		return steps.toString();
	}
}
