import java.util.Scanner;

class Jlab63

// to see if a symbol is a letter



{
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	String chr;
    	int alphaCount = 0;
    
    	System.out.println("Enter your symbol ");   
		Scanner stringScanner = new Scanner(System.in);
		chr = stringScanner.next(); 
		
			for(int i = 0; i < chr.length(); i++)
			{
		
				char ch = chr.charAt(i);
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