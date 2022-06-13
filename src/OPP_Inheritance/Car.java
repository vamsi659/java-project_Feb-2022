package OPP_Inheritance;

public class Car extends Vehicle {

static final int wheels = 4;
	
	int speed = 100;
	
	public static void seating() {
		System.out.println("Car -- seating....");
	}
	
	private void getLicenseNumber() {
		System.out.println("Car -- license : 12345");
	}

	public final void highSpeed() {
		System.out.println("Car -- highspeed");
	}
	
	public void start() {
		System.out.println("Car -- start");
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
}
