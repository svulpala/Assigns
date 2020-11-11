package Assignments;

public class Collections {
	static String s= "Success is not forever and Failure is not fatal";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = s.toCharArray();
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]);
		}
	}

	
	}








//Input String : "Success is not forever and Failure is not fatal"
//Output String : "sseccuS si ton reverof dna eruliaF si ton lataf"