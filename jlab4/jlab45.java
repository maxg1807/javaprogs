import java.util.Scanner;
class Jlab45

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose : 			a program that reverses the input text


{
    public static void main(String[] args)
    {
    	String name = "";
		String reverseStr = "";
		int reverse;
    	Scanner scan = new Scanner(System.in);
    	
    	
    	System.out.println("Enter your full name ");   
		name = scan.nextLine() ;
		
		for(reverse=name.length() - 1; reverse!=-1;)
		{
			char ch = name.charAt(reverse);
			reverseStr = reverseStr + ch;
			reverse--;
		}
		System.out.println(reverseStr);
		
    	
    }
}

