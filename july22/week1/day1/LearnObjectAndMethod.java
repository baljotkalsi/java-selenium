package july22.week1.day1;

public class LearnObjectAndMethod {  //class name

	public void applyBrake()
	{
		System.out.println("Apply Brake");
	}
	
	public static void main(String[] args) { //main method
		
		//ClassName objectName = new Classname();  --- SYNTAX to create obejct name
		LearnObjectAndMethod objectName = new LearnObjectAndMethod();
		objectName.applyBrake();
	}

}
