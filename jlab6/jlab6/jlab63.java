import java.util.Scanner;

class Jlab63

// to return the number of alphabetic symbols in a string



{
	public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	String string;
    	
    	System.out.println("Enter your symbol ");   
		Scanner stringScanner = new Scanner(System.in);
		string = stringScanner.next(); 
		alphaCount(string);
		
    }
    public static void alphaCount(String string)
    {
    	int alphaCount = 0;
	    for(int i = 0; i < string.length(); i++)
			{
		        
				char ch = string.charAt(i);
        		if(ch >= 'a' && ch <= 'z')
        			{
                   		alphaCount ++;
        			}
        		else if(ch >= 'A' && ch <= 'Z')
        			{
        				alphaCount ++;
        			}
        	}
        System.out.println(alphaCount);
    }
    
    
} 