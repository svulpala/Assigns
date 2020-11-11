package loops;

public class NestLoop {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;// no of rows which is increasing 
		int y ;// no of columns-decreasing
		for (x=1;x<=5; x++)
		{
			for(y=1;y<=x;y++)
			{
				System.out.print(y);//it will print y value
			}
			System.out.println();// this statement will take it to the next line
		}

	}
}
