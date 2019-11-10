package abstractions;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String args[]) {
		
		List<AbstractVehicle> cars = new ArrayList<AbstractVehicle>();
		cars.add(new Dodge("Dodge", "Dart", "White"));
		cars.add(new Chevy("Chevy", "Cruze", "Black"));
		cars.add(new Ford("Ford", "Fusion", "Grey"));
		
		for(AbstractVehicle v:cars) {
			System.out.println(v.getName());
			v.startEngine();
			System.out.println("");
		}
		
		while(cars.get(0).engineRunning) {
			cars.get(0).accelerate();
		}
		System.out.println("");
		
		for(AbstractVehicle v:cars) {
			System.out.println(v.getName());
			v.accelerate();
			System.out.println("");
		}
	}
}
