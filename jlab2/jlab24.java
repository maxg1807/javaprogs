
class Divisibleornot

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose :to see if a number is even or odd	



{
    public static void main(String[] args)
    {
    	int number;
    	int number2;
    	
    	
    	
    	System.out.print("enter number-> ");
    	number=EasyIn.getInt();
    	System.out.print("Enter second number-> ");
    	number2=EasyIn.getInt();
    	if(number % number2==0)
    	System.out.println("divisible");
    	else
    	System.out.println("indivisible");
    
    }
}

