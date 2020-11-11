package Assignments;

public class ParaConstructor {
	// creating parameterized constructor 
	// same name as class name 
	// cannot have return type(void, int,  string)
	//do not have static, final, abstract, synchronized.
	//accept only public, private, default
	//
	ParaConstructor(String a,String b)
	{
		System.out.println("Ram" +" "+ "Sita");
	}
	// conctructor can overloaded with different parameters.
	ParaConstructor(int c,String b)
	{
		System.out.println(10 +" "+ "Sita");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParaConstructor obj = new ParaConstructor("Ram", "Sita");
		
		ParaConstructor obj1 = new ParaConstructor(10, "Sita");
	}

}
