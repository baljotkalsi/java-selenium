package july22.week1.day5;

public class LearnHowToPassMethod {
	
	public void employee(String name,int emp_id,float salary)   //create a method with args
	{
		System.out.println("Name is: "+name+" "+"Id is: "+emp_id+" "+"Salary is: "+salary); //create a print out statement using variables
	}

	public static void main(String[] args) {
		LearnHowToPassMethod objectlhtpm = new LearnHowToPassMethod(); //create and object of the class
		objectlhtpm.employee("Sushakar", 25, 1000.12f);  // use the object to call the method and input data
		objectlhtpm.employee("Baljot", 26, 1500.12f);   // use the object to call the method and input data

	}

}
