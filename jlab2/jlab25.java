
class Divisibleornot3numbers

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose :to see if a number is even or odd	



{
    public static void main(String[] args)
    {
    	int number;
    	int number2;
    	int number3;
    	
    	
    	
    	System.out.print("enter number-> ");
    	number=EasyIn.getInt();
    	System.out.print("Enter second number-> ");
    	number2=EasyIn.getInt();
    	System.out.print("Enter third number-> ");
    	number3=EasyIn.getInt();
    	if(number % number2==0)
    	System.out.println("divisible by number 2");
    	else if(number % number3==0)
    	System.out.println("divisble by number 3");
    	else
    	System.out.println("indivisible");
    
    }
}

