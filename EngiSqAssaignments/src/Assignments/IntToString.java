package Assignments;

public class IntToString {
	static int getLLessThanN(int number, int digit)
	{
	//Converting digit to char

	char c = Integer.toString(digit).charAt(0);

	//Decrementing number & checking whether it contains digit
	
	for (int i = number; i > 0; --i)
	{
	if(Integer.toString(i).indexOf(c) == -1)
	{
	//If 'i' doesn't contain 'c'

	return i;
	}
	}

	return -1;
	}

	public static void main(String[] args)
	{
	System.out.println(getLLessThanN(123, 2));

	System.out.println(getLLessThanN(4582, 5));

	System.out.println(getLLessThanN(98512, 5));

	System.out.println(getLLessThanN(548624, 8));
	}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	



/*Write a java program to find theL less than a given number N which should not contain a 
given digit D.
For example, If 155 is the given number and 5 is the given digit, then you should find the largest 
number less than 155 such that it should not contain 5 in it. In this case, 149 will be the answer.*/

//Input for program:
//System.out.println(nearestDesiredNumber(123, 2));
//System.out.println(nearestDesiredNumber(4582, 5));
//System.out.println(nearestDesiredNumber(98512, 5));
//System.out.println(nearestDesiredNumber(548624, 8));

//Output of the program:
//119
//4499
//98499
//547999

//Hint: We can convert an integer to String by using Integer.toString() method.