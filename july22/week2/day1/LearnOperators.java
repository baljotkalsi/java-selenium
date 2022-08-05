package july22.week2.day1;

public class LearnOperators {

	public int a = 30;
	public int b = 20;
	
	
	public void addition()
	{
		//int a = 10;
		//int b = 20;
		int sum = a+b;
		System.out.println("Sum of 2 number is: "+sum);
	}
	
	public void subtraction()
	{
		//int a = 15;
		//int b = 10;
		int minus = a-b;
		System.out.println("Subtraction of 2 number is: "+minus);
	}
	
	public void multiplicton()
	{
		int multiplication = a*b;
		System.out.println("Multiplication of 2 number is: "+multiplication);
	}
	
	public void division()
	{
		System.out.println("The division of 2 number is: " +a/b);
	}
	
	public void mod()
	{
		System.out.println("The mod of 2 numbers is: "+a%b);
	}
	
	public static void main(String[] args) {
				
		LearnOperators le = new LearnOperators(); 			//ctreating object
		le.addition();
		le.subtraction();
		le.multiplicton();
		le.division();
		le.mod();
	}

}

