package learn.inheritance;

public class Android extends Mobile{
	
	public void camera()
	{
		System.out.println("Camera");
	}

	public static void main(String[] args) {
		Android android = new Android();
		android.camera();
		android.messages();
		android.keypad();
	}

}
