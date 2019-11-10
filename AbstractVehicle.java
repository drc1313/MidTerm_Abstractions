package abstractions;

public abstract class AbstractVehicle {

	protected String color;
	protected String make;
	protected String model;
	protected boolean engineRunning = false;
	protected int gas = 100;
	protected int speed = 0;
	
	AbstractVehicle(String ma, String mo, String co){
		make = ma;
		model = mo;
		color = co;
	}
	
	public String getName() {
		return make+" "+model;
	}
	
	public void startEngine() {
		
		System.out.println("You Turned the key");
		
		if(engineRunning) {
			System.out.println("Engine is already running");
		}else if(gas==0) {
			System.out.println("Out of gas");
		}else {
			System.out.println("Engine Started");
			gas--;
			engineRunning = true;
		}
	};
	
	public void accelerate() {
		if(engineRunning) {			
			if(gas>0){
				if(speed<120) {
					speed+=10;
				}
				gas--;
				System.out.println("The "+make+" "+model+" is going "+speed+" MPH");
			}else {
				engineRunning = false;
				System.out.println("The "+make+" "+model+" is Out of gas");
				speed = 0;
			}
		}else {
			System.out.println("Nothing Happend");
		}
	}
	
	public void brake() {	
		if(speed>0){
			speed-=10;
			System.out.println("The "+make+" "+model+" "+" moving slower");
		}else {
			System.out.println("Nothing happend");
		}
		
	}
	
}
