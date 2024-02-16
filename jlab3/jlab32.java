
class Terminateat0

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose :to find the sum of a collection of data and teminate when the value reaches zero



{
    public static void main(String[] args)
    {
    	int number;
    	int oldnumber=0;
    	int total;
    	
    	do
    	{
    	System.out.print("enter a number -> ");
    	number=EasyIn.getInt();
    	total =oldnumber+number;
    	System.out.println(+total);
    	oldnumber =total;
    	}
    	while (total !=0);
       
    	
    }
}


