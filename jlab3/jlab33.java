
class Integerlist

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose :Write a program to read a list of integer values which will find and display the index of the first occurrence and the last occurrence of the number 12. Your program should print the Index values of 0 (zero) if the number 12 is not found. The index is the sequence number of the data item 12. For example if the 8th data item is the only 12, the index value 8 should be displayed for the first and last occurrence.



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
    		System.out.print("\n\n\t first position "+firstposition );
    		System.out.print("\n\n\t last position "+lastposition);
    		System.out.print("\n\n\t");
    	
    	
    	
    
    }
}


