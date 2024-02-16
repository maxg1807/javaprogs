
class Cardintreset

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose :to calculate the credit card interest	



{
    public static void main(String[] args)
    {
    	double interest=0;
    	double money;
    	
    	System.out.print("enter amount of money on card-> ");
    	money=EasyIn.getDouble();
    	if(money<500)
    	{
    	interest=money*1.12;
    	}
    	else if(money>500)
    	{
    	interest=560+(money-500)*1.18;
    	}
    	System.out.println("your amount to be paid is "+interest);
    }
}

