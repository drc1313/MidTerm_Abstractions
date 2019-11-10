package abstractions;

public class Ford extends AbstractVehicle{

	Ford(String ma, String mo, String co) {
		super(ma, mo, co);
	}

	@Override
	public void startEngine() {
		
		System.out.println("You Pressed the button");
		
		if(engineRunning) {
			System.out.println("Engine is already running");
		}else if(gas==0) {
			System.out.println("Out of gas");
		}else {
			System.out.println("Engine Started");
			gas--;
			engineRunning = true;
		}
		
	}


}
