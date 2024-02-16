
class Jlab42

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose : 			a program that prints the firstname relitive to the space


{
    public static void main(String[] args)
    {
    	String name;
    	String firstname;
    	int spacepos;
    	
    
    	System.out.println("Enter your full name ");   
		name = EasyIn.getString() ;
		spacepos = name.indexOf(" ");
		firstname = name.substring(0, spacepos);
		System.out.println("the firstname is " + firstname);
		
    	
    }
}

