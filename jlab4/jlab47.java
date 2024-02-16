
class Jlab47

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose : 			a program that count the amount of a specified character


{
    public static void main(String[] args)
    {
    	String name;
    	int NoChoosen = 0;
    	
    	System.out.println("Enter your full name ");   
		name = EasyIn.getString();
		for(int i = 0; i < name.length(); i++)
		{
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'A')
			{
				NoChoosen++;
			}
		}
		
		System.out.println("the number of a is " +  NoChoosen);
		
    	
    }
}

