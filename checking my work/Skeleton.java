
class Skeleton

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
    	String name ;
    
    	System.out.println("Enter your name ");   
		name = EasyIn.getString() ;
    	System.out.println("Hello " + name) ;
    	System.out.println("Have a nice day !") ;
    }
}

