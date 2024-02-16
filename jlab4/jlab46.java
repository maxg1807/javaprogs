class Jlab46

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose : 			a program that reverses the order of input text


{
    public static void main(String[] args)
    {
    	String name = "";
    	String surname;
    	String firstname;
    	int spacepos;
    	
    	
    	System.out.println("Enter your full name ");   
		name = EasyIn.getString() ;
		spacepos = name.indexOf(" ");
		surname = name.substring(spacepos +1);
		firstname = name.substring(0 , spacepos);
		System.out.println(surname +" "+ firstname);
		
    	
    }
}

