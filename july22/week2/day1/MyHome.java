package july22.week2.day1;

public class MyHome {

	private String bed = "Queen";
			
	public void bedroom()
	{
		System.out.println(bed);
	}
	
	public static void main(String[] args) {
		PublicPark pp = new PublicPark();
		MyHome mh = new MyHome();
		mh.bedroom();
		pp.playarea();
		pp.swing1();
	}

}
