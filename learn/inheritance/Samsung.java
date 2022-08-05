package learn.inheritance;


// without using extend 
//create object in main method for the class you want to use



public class Samsung {
	
	public void dualcamera()
	{
		System.out.println("Dual Camera");
	}
	public static void main(String[] args) {
		Samsung s22 = new Samsung();
		Mobile s23 = new Mobile();
		s22.dualcamera();
		s23.messages();
		s23.keypad();
	}

}
