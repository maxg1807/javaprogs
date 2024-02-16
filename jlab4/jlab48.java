class Jlab48

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose : 			a program that removes middle name from input


{
    public static void main(String[] args)
    {
    	String name;
    	String surname;
    	String firstname;
    	String middlename;
    	int spacepos;
    	int spacepos2;
    	
    
    	System.out.println("Enter your full name ");   
		name = EasyIn.getString() ;
		spacepos = name.indexOf(" ");
		spacepos2 = name.lastIndexOf(" ");
		surname = name.substring(spacepos2 +1);
		firstname = name.substring(0, spacepos);
		middlename = name.substring(0, spacepos2);
		System.out.println(firstname +" "+ surname);
		
    	
    }
}