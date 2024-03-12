import java.util.Scanner;

class Jlab62

// to see if a symbol is a letter



{
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	String Char;
    
    	System.out.println("Enter your symbol ");   
		Char = scan.nextchar();
        if(Char >= a <= z || Char >= A <= Z)
        	{
        		System.out.println("this is an alphabetic letter");
        	}
        else
        	{
        		System.out.println("this is not an alphabetic letter");
        	}
    }
}

