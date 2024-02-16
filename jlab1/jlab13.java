
class Sumproductaverage

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose : 			A Sample skeleton program


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {
    	int number1;
    	int number2;
    	int number3;
    	int answer1;
    	int answer2;
    	int answer3;
    	
    	System.out.print("enter first number-> ");
    	number1 = EasyIn.getInt();
    	System.out.print("enter second number-> ");
    	number2 = EasyIn.getInt();
    	System.out.print("enter third number-> ");
    	number3 = EasyIn.getInt();
    	answer1 = number1+number2+number3;
    	answer2 = number1*number2*number3;
    	answer3 = answer1/3;
    	System.out.println("the sum of the numbers is "+answer1);
    	System.out.println("the product of the numbers is "+answer2);
    	System.out.println("the average of the numbers is "+answer3);
    }
}

