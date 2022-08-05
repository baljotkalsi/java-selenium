package learn.inheritance;

public class Auto extends Vehicle{
	
	public void handStarter()
	{
		System.out.println("Hand Starter");
	}

	public static void main(String[] args) {
		Auto auto = new Auto();
		auto.handStarter();
		auto.applyBrake();
		auto.soundHorn();
		
	}

}
