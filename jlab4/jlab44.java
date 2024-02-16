
class Jlab44

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose : 			to count the number of capitals in the name


{
    public static void main(String[] args)
    {
    	String name;
    	int upper=0;
    
    	System.out.println("Enter your full name ");   
		name = EasyIn.getString() ;
		for(int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            {
                upper++;
            }
        }        
		System.out.println("the number of capitals is " + upper);
		
    	
    }
}

