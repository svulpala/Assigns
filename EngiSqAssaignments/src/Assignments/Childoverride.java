package Assignments;

public class Childoverride extends Parentoverride{
	public void credit()
	{
		System.out.println("The interest rate is 15%");
	}
	//used the same method as parent but body is different 	
	public void ROI()
	{
		System.out.println("The ROI is 20%");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childoverride obj = new Childoverride();
		obj.ROI();
		obj.loan();
		obj.credit();

	}

}
// Camel Case --> displaySomethingExtra()
// Pascal Case --> ChildOverride