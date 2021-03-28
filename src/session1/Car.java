package session1;

// Car is a Vehicle
public class Car extends Vehicle{

	
	

	public Car(int yearOfMake, String color, int speed) {
		super(yearOfMake, color, speed);
	}

	
	//Since car is a concrete class, it has the respondility
	//to provide implementation for Vehicle's abstract methods
	@Override
	public void move() {
		System.out.println("Moving....");
	}
	
	
}
