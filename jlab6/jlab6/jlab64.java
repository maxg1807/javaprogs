import java.util.Scanner;

class Jlab64

// to see if a symbol is a letter


{
	
    public static void main(String[] args)
    {
    	    Scanner scan = new Scanner(System.in);
    		System.out.print("enter result-> ");
    		int mark = scan.nextInt();
    		award(mark);
    }
		public static void award(int mark)
   	 	{
    		
	    	
	    	if(mark>=70)
	    	System.out.println("distinction");
	    	else if(mark>=63)
	    	System.out.println("merit1");
	    	else if(mark>=55)
	    	System.out.println("merit2");
	    	else if(mark>=40)
	    	System.out.println("pass");
	    	else if(mark<40)
	    	System.out.println("fail");
    
    	}
}

