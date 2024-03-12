import java.util.Scanner;

class Jlab62

// to see if a symbol is a letter



{
    public static void isAlpha(String chr)
    {
    	for(int i = 0; i < chr.length(); i++)
			{
		
				char ch = chr.charAt(i);
        		if(ch >= 'a' && ch <= 'z')
        			{
        				System.out.println("this is an alphabetic letter");
        			}
        		else if(ch >= 'A' && ch <= 'Z')
        			{
        				System.out.println("this is an alphabetic letter");
        			}
        		else
        			{
        				System.out.println("this is not an alphabetic letter");
        			}
        	}	
    }
    public static void main(String[] args)
    {	
        String chr;
        Scanner scan = new Scanner(System.in);
    	System.out.println("Enter your symbol ");   
		Scanner stringScanner = new Scanner(System.in);
		chr = stringScanner.next(); 
		isAlpha(chr);
    }
}