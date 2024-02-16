
class Test2BF2324

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Group : B
// Date :				1/9/2005
// Purpose : 			Test


{
    public static void main(String[] args)
    {
    	String team1;
    	String team2;
    	int convertedTry;
    	int unconvertedTry;
    	int penalty;
    	int noOfCT1;
    	int noOfUcT1;
    	int noOfPen1;
    	int noOfCT2;
    	int noOfUcT2;
    	int noOfPen2;
    	int finalScore1;
    	int finalScore2;
    	int difference1;
    	int difference2;
    
    	convertedTry=7;
    	unconvertedTry=5;
    	penalty=3;
    	
    	System.out.println("Enter name of team 1 : ");
    	team1=EasyIn.getString();  
    	 
		System.out.println("Enter name of team 2 : ");
		team2=EasyIn.getString();
		
		System.out.println("Enter the amount of converted tries scored by " +team1 );
		noOfCT1=EasyIn.getInt();
		
		System.out.println("Enter the amount of unconverted tries scored by " +team1 );
		noOfUcT1=EasyIn.getInt();
		
	    System.out.println("Enter the amount of penalties scored by " +team1 );
		noOfPen1=EasyIn.getInt();
		
		System.out.println("Enter the amount of converted tries scored by " +team2 );
		noOfCT2=EasyIn.getInt();
		
		System.out.println("Enter the amount of unconverted tries scored by " +team2 );
		noOfUcT2=EasyIn.getInt();
		
        System.out.println("Enter the amount of penalties scored by " +team2 );
		noOfPen2=EasyIn.getInt();
		
		finalScore1= noOfCT1+noOfUcT1+noOfPen1;
		finalScore2= noOfCT2+noOfUcT2+noOfPen2;
		
		difference1= finalScore1-finalScore2;
		difference2= finalScore2-finalScore1;
		
		if(finalScore1 > finalScore2)
		{
			System.out.println("the final score is "+team1 +finalScore1" points, "+team2  +finalScore2 " points the winners were "+team1" by "+difference1" points");
		}
		else if (finalScore2>finalScore1)
		{
	//		System.out.println("the final score is "+team1+ finalScore1" points, "+team2 + finalScore2 " points the winners were "+team2" by "+difference2" points");
		}
		else 
		{
	//		System.out.println("the final score is "+team1+ finalScore1" points, "+team2 + finalScore2 " points the match was a draw");
		}
		
    }
}

