import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		try{
		
			
			System.out.println("Integer Calculation");
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nFirst number :");
		int a=input.nextInt();
		
		System.out.print("Second number :");
		int b=input.nextInt();
		
		int sum=a+b;
		
		System.out.println("The answer is: "+sum);
		
		}catch(Exception e){
			
			System.out.println("Invalid Input");
		}
	}
}
