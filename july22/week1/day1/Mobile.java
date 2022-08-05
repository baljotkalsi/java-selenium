package july22.week1.day1;

public class Mobile {

	String mobileModel = "Samsung";
	int mobileWeight = 10;
	boolean isFullCharge = true;
	double mobileCost = 499.99;
	
	public static void main(String[] args) {
		Mobile mobileNew = new Mobile();
		System.out.println("Mobile Make is: "+mobileNew.mobileModel);
		System.out.println("Mobile Weight is: "+mobileNew.mobileWeight);
		System.out.println("Mobile Charge is : "+mobileNew.isFullCharge);
		System.out.println("Price of Mobile is: "+mobileNew.mobileCost);
	}

}
