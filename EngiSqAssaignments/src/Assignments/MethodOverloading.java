package Assignments;

public class MethodOverloading {
	//same methodname but different parameters
	
	
	void virus(String a, int c)
	{
		System.out.println(a+c);
	}
	
	void virus(String b)
	{
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MethodOverloading obj = new  MethodOverloading();
		

obj.virus("droplet", 100);
obj.virus("contact");
obj.virus("airborn");

	}

}
