package july22.week2.day1;

public class LearnLogicalOperators {

	boolean a = true;
	boolean b = false;
	
	
	public void andOperator()
	{
		if (a && b == true)
		{
			System.out.println("A and B are true");
		}
		
		else if (a || b ==true)
		{
			System.out.println("Either A or B are True");
			
		}
		else
		{
			System.out.println("A and B are false");
		}
	}
	public static void main(String[] args) {
		LearnLogicalOperators llo = new LearnLogicalOperators();
		llo.andOperator();

	}

}
