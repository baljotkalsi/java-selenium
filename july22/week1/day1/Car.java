package july22.week1.day1;

public class Car {

	public void drive()    //creating new method outside main method
	{
		System.out.println("Drive the Car");
	}
	public void accelerate()     //creating new method outside main method
	{
		System.out.println("Accelerate the Car");
	}
	public static void main(String[] args) {
		
		Car Toyota = new Car();   //creating an object
		Toyota.drive();		      //calling a Method for an object
		Toyota.accelerate();      //calling a Method for an Object
	}

}
