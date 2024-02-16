
class Jlab36

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose : find the largest smallest and average value of anf unknown amount of numbers printed out after each number


{
    public static void main(String[] args)
    {
    	int largest=0;
    	int smallest=0;
    	double average;
    	int index=1;
    	int noofvalues;
    	int number=0;
    	int numbertotal=0;
    	int dupe1=0;
    	int dupe2=0;
    	
    
    	System.out.print("enter number of values ");
    	noofvalues = EasyIn.getInt();
    	for(index=1; index<=noofvalues;index++)
    	{
    		System.out.print("enter number ");
    		number = EasyIn.getInt();
    		numbertotal= numbertotal + number;
    		average = numbertotal/index;
    		if(index==1||
    		number>=largest)
    		{
				
    			if(number==largest)
    		    {
    		   	dupe1=dupe1+1;
    		    }
			    else
				{
					dupe1=0;
				}
				largest=number;
    		}
    		if(index==1||number<=smallest)
    		{
				
    		  if(number==smallest)
    		  {
    		  	dupe2=dupe2+1;
    		  }
			  else
			  {
				dupe2=0;
			  }
			  smallest=number;
    		}
    			
    	System.out.println("the current largest value is "+largest);
    	System.out.println("it has been repeated "+dupe1);
    	System.out.println("the current smallest value is "+smallest);
    	System.out.println("it has been repeated "+dupe2);
    	System.out.println("the current average of the values is "+average);
    	}
    	average = numbertotal/noofvalues;
    	System.out.println("the final largest value is "+largest); 
    	System.out.println("it has been repeated "+dupe1);
    	System.out.println("the final smallest value is "+smallest);
    	System.out.println("it has been repeated "+dupe2);
    	System.out.println("the final average of the values is "+average);
    	
    }
}