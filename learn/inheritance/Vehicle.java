package learn.inheritance;

public class Vehicle {
	
	public void applyBrake()
	{
		System.out.println("Apply Brake");
	}
	
	public void soundHorn()
	{
		System.out.println("Sound Horn");
	}

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.applyBrake();
		vehicle.soundHorn();
	}

}
