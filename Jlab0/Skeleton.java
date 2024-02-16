
class Monthnames

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose :to change the number of a month to the name of the month



{
    public static void main(String[] args)
    {
    	int index;
    	int number;
    	int firstposition=0;
    	int lastposition=0;
    	
    	System.out.print("enter a number-> ");
    	number= EasyIn.getInt();
    	index=0;
    	while(number!=0)
    		{
    			index++;
    			if(number==12)
    				{
    					if(firstposition==0)
    						{
    							firstposition=index;
    						}
    						lastposition=index;
    				}
    				System.out.print("enter next number-> "+(index+1)+ ":");
    				number=EasyIn.getInt();
    		}
    		System.out.print("first position"+firstposition );
    		System.out.print("last position"+lastposition);
    		System.out.print("\n\n\t");
    	
    	
    	
    
    }
}

