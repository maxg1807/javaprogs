
class Insurancepremium

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose :to calculate the insurance premium	



{
    public static void main(String[] args)
    {
    	double insurancevalue;
    	double claims;
    	double increase;
    	double discount=0;
    	double answer;
    	
    	
    	
    	
    	System.out.print("enter value of last years insurance-> ");
    	insurancevalue=EasyIn.getDouble();
        System.out.print("how many times have you claimed on your insurance-> ");
        claims=EasyIn.getDouble();
        increase=insurancevalue*1.05;
        if(claims==0)
        {
        discount=increase*-0.4;
        }
        else
        {
        discount=(increase*1.20)*claims;
        }
        answer = increase+discount;
        System.out.println("your insurance is now £"+answer);
    
    }
}