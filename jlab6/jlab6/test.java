import java.util.Scanner;

class Test



{
	
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	int input;
    	int answer;
    	System.out.print("enter number -> ");
    	input = scan.nextInt();
    	answer = input.isEven();
    	System.out.println(answer);
    }
}