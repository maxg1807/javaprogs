
class Whatislargest

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose :to check the largest number	



{
    public static void main(String[] args)
    {
    	int number1;
    	int number2;
    	int number3;
    	
    	System.out.print("enter first number-> ");
    	number1=EasyIn.getInt();
    	System.out.print("enter second number-> ");
    	number2=EasyIn.getInt();
    	System.out.print("enter last number-> ");
    	number3=EasyIn.getInt();
    	if(number1>number2 && number1>number3)
    	System.out.println("the largest is "+number1);
    	else if(number2>number1 && number2>number3)
    	System.out.println("the largest is "+number2);
    	else if(number3>number1 && number3>number2)
    	System.out.println("the largest is "+number3);
    }
}

