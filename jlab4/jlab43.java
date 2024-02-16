
class Jlab43

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose : 			a program that prints the number of characters


{
    public static void main(String[] args)
    {
    	String name;
    	int number;
    	
    
    	System.out.println("Enter your full name ");   
		name = EasyIn.getString() ;
		number=name.length();
		number=number-1;
		System.out.println("the number of letters is " + number );
		
    	
    }
}

