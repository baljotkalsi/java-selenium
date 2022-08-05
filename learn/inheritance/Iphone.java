package learn.inheritance;

public class Iphone extends Mobile{

	public void touchpad()
	{
		System.out.println("Touchpad");
	}
		
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.touchpad();
		iphone.keypad();
		iphone.messages();		
			
	}

}
