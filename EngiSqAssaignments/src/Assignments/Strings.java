package Assignments;

public class Strings {
	static String str = "What We think, We Become!";
	
	public static void main(String[] args) {
		
		// This will print all the string statement in lowercase
		System.out.println(str.toLowerCase());
		// This will print all the string statement in Uppercase
		System.out.println(str.toUpperCase());
		// This will print
		System.out.println(str.toCharArray());
		//Will print the character at 13
		System.out.println(str.charAt(13));
		//This will print str value and also Buddha.. 
		System.out.println(str.concat(" - Buddha"));
		//This will Returns true if and only if this string contains the specified sequence of char values
		System.out.println(str.contains(","));
		//Tests if this string ends with the specified suffix- prints true
		System.out.println(str.endsWith("!"));
		//Tests if this string starts with the specified prefix-prints true
		System.out.println(str.startsWith("What"));
		//Returns the index within this string of the first occurrence of the specified substring
		System.out.println(str.indexOf("We"));
		
//System.out.println(str.indexOf("We", 7));
		
		//Returns the index within this string of the last occurrence of the specified substring
		System.out.println(str.lastIndexOf("We"));
		// total characyers in string 
		System.out.println(str.length());
		// replaced I in the place of we
		System.out.println(str.replace("We", "I"));
		// replaced first we by I 
		System.out.println(str.replaceFirst("We", "I"));
		//it returns the substring starting from 5 value and will printg rest of the string 
		System.out.println(str.substring(5));
		//it returns the value with substring starting from 5 and ends with 7 value
		System.out.println(str.substring(5, 7));
		
	//System.out.println(str.split(","));
		//since 0 is given, first part of the string before , is printed
		System.out.println(str.split(",")[0]);
		//since 1 is given, last part of the string after , is printed
		System.out.println(str.split(",")[1]);
	}

}
