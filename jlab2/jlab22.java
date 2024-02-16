
class Exammarks

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose :to give a grade based average on exam results	



{
    public static void main(String[] args)
    {
    	int mark1;
    	int mark2;
    	int mark3;
    	int answer;
    	
    	
    	System.out.print("enter first result-> ");
    	mark1=EasyIn.getInt();
    	System.out.print("enter second result-> ");
    	mark2=EasyIn.getInt();
    	System.out.print("enter third result-> ");
    	mark3=EasyIn.getInt();
    	answer=(mark1+mark2+mark3)/3;
    	System.out.println(answer);
    	if(answer>=70)
    	System.out.println("distinction");
    	else if(answer<=69)
    	System.out.println("merit1");
    	else if(answer<=62)
    	System.out.println("merit2");
    	else if(answer<=54)
    	System.out.println("pass");
    	else if(answer<40)
    	System.out.println("fail");
    
    }
}

