package learn.inheritance;

public class Mobile {

	public void messages()
	{
		System.out.println("Messages");
	}
	
	public void keypad()
	{
		System.out.println("keypad");
	}
	
	
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.messages();
		mobile.keypad();
		
	}

}
