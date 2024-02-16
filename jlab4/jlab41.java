
class Jlab47

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose : 			a program that prints the surname relitive to the space


{
    public static void main(String[] args)
    {
    	String name;
    	String surname;
    	int spacepos;
    	
    
    	System.out.println("Enter your full name ");   
		name = EasyIn.getString() ;
		spacepos = name.indexOf(" ");
		surname = name.substring(spacepos +1);
		System.out.println("the surname is " + surname);
		
    	
    }
}

