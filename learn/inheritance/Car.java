package learn.inheritance;

public class Car extends Vehicle{
	
	public void airConditioner()
	{
		System.out.println("Air Conditioner");
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.airConditioner();
		car.applyBrake();
		car.soundHorn();
	}

}
