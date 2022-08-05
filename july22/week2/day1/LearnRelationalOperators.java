package july22.week2.day1;

public class LearnRelationalOperators {

	public int a = 50;
	public int b = 40;
		
	public void lessthan()
	{
		if (a<b)
		{
			System.out.println("A is lesser than B");
		}
		else if (a>b)
		{
			System.out.println("A is greater than B");
		}
		else if (a==b)
		{
			System.out.println("A is Equal to B");
		}
		else if (a!=b)
		{
			System.out.println("A is not Equal to B");
		}
		else if (a<=b)
		{
			System.out.println("A is less than or equal to B");
		}
		else
		{
			System.out.println("A is greater than or equalto B");
		}
	}
	
	public static void main(String[] args) 
	{
		LearnRelationalOperators lro = new LearnRelationalOperators();
		lro.lessthan();
	}

}
