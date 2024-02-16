
class Relationto0

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose :to tell if the input is equal to less than or greater than zero		



{
    public static void main(String[] args)
    {
    	int number;
    	
    	System.out.print("enter a number-> ");
    	number=EasyIn.getInt();
    	if(number > 0)
    	System.out.print(number+" is greater than zero ");
        else if(number < 0)
        System.out.print(number+" is less than zero ");
    	else if(number == 0)
    	System.out.print(number+" is zero ");
    
    }
}

