package Adapter;

public class Adapter implements Car{

	public String accelerate(String typeCar) {
		
		if(typeCar.equals("Sport")) { 
			return new SportCar().accelerate();
		}else if(typeCar.equals("Old")) { 
			return new OldCar().accelerate();
		}else if(typeCar.equals("Race")) { 
			return new RaceCar().accelerate();
		}else if(typeCar.equals("Electric")) { 
			return new ElectricCar().accelerate();
		}
		
		return "";
	}

	public String brake(String typeCar) {
		if(typeCar.equals("Sport")) { 
			return new SportCar().brake();
		}else if(typeCar.equals("Old")) { 
			return new OldCar().brake();
		}else if(typeCar.equals("Race")) { 
			return new RaceCar().brake();
		}else if(typeCar.equals("Electric")) { 
			return new ElectricCar().brake();
		}
		
		return "";
	}

	public String handling(String typeCar) {
		if(typeCar.equals("Sport")) { 
			return new SportCar().handling();
		}else if(typeCar.equals("Old")) { 
			return new OldCar().handling();
		}else if(typeCar.equals("Race")) { 
			return new RaceCar().handling();
		}else if(typeCar.equals("Electric")) { 
			return new ElectricCar().handling();
		}
		
		return "";
	}

}
