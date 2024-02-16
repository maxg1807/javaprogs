class Jlab53

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose : 			word count program


{
    public static void main(String[] args)
    {
    	String str ;
    	String current = "";
    	int spacePos = 0;
    	int i;
    	int wordcount=0;
    	int min=9999;
    	int max=0;
    	int average;
    	int count =0;
    	int currentlength;
    	boolean trueCheck = true;
    	String reverseStr = "";
        
        System.out.println("please enter your string of text-> ");
        str = EasyIn.getString();
        while(!(str.equals("")))
        	{
        		spacePos=str.indexOf(" ");
        	    if(spacePos == -1)
        	    	{
        	    		spacePos = str.length() -1;
        	    	}
        	    	current = str.substring(0, spacePos +1);
        	    if(spacePos == str.length()-1)
        	    	{
        	    		current = current + " ";
        	    	}
        	    reverseStr = current + reverseStr;
        	    
        	    current = current.trim();
        	    for(i = 0; i <= current.length() -1; i++)
        	    	{
        	    		currentlength = current.length();
        	    		if(!(current.charAt(i)>= 'a' && current.charAt(i)<= 'z' || current.charAt(i)>= 'A' && current.charAt(i)>= 'Z'))
        	    			{
        	    				trueCheck = false;
        	    			}
        	    		if(current.length() >= max)
        	    			{
        	    				currentlength = max;
        	    			}
        	    		if(current.length() <= min)
        	    			{
        	    				currentlength = min;
        	    			}
        	    	}
        	    
        	    if(trueCheck)
        	    	{
        	    		wordcount++;
        	    	}
        	    if(current.equals(""))
        	    	{
        	    		wordcount--;
        	    	}
        	   
        	   str = str.substring(spacePos + 1);
        	   trueCheck = true;
        	}
        average = wordcount;
        reverseStr= str +" "+ reverseStr;
		System.out.println("the maximum is "+ max);
		System.out.println("the minimum is "+ min);
		System.out.println("the average is "+ average);
		System.out.println(wordcount);
  }
}