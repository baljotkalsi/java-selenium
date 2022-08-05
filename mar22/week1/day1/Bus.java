package mar22.week1.day1;

public class Bus {

	public void driveBus()
	{
		String color = "Black";    //local variable to method
		System.out.println(color);
	}
	
	public void applyBrake()
	{
		String color = "Red";   //local variable to method
		System.out.println(color);
	}
	
	public static void main(String[] args) {
		Bus MyBus = new Bus();
		MyBus.driveBus();
		MyBus.applyBrake();

	}

}
