package mar22.week1.day1;

public class Car {
	
	public void applyBrake()
	{
		System.out.println("Apply Brake");
	}
	
	public void applyHonk()
	{
		System.out.println("Sound Horn");
	}

	public static void main(String[] args) {
		Car Honda = new Car();
		Honda.applyBrake();
		Honda.applyHonk();

	}

}
