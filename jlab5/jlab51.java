class Jlab51

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
        	    		if(!(current.charAt(i)>= 'a' && current.charAt(i)<= 'z' || current.charAt(i)>= 'A' && current.charAt(i)>= 'Z'))
        	    		{
        	    			trueCheck = false;
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
        
        System.out.println("the number of words is "+wordcount);
    }
}