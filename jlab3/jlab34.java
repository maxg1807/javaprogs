
class Jlab34

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose : find the largest smallest and average value of anf unknown amount of numbers


{
    public static void main(String[] args)
    {
    	int largest=0;
    	int smallest=0;
    	double average;
    	int index=1;
    	double noofvalues;
    	int number;
    	double numbertotal=0;
    	
    
    	System.out.print("enter number of values ");
    	noofvalues = EasyIn.getInt();
    	for(index=1; index<=noofvalues;index++)
    	{
    		System.out.print("enter number ");
    		number = EasyIn.getInt();
    		numbertotal= numbertotal + number;
    		if(index==1||
    		number>=largest)
    		{
    			largest=number;
    			
    		}
    		if(index==1||number<=smallest)
    		{
    		
    			smallest=number;
    			
    		}
    	}
    	average = numbertotal/noofvalues;
    	System.out.println("the largest value is "+largest);
    	System.out.println("the smallest value is "+smallest);
    	System.out.println("the average of the values is "+average);
    	
    }
}