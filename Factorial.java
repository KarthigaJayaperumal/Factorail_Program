package april_program;

import java.util.Scanner;

public class Factorial{  
		public static void main(String args[]){  
		
	
	//Scanner sc=new Scanner(System.in);
			Factorial fl=new Factorial();
	fl.factorial();
	
//System.out.println("Please No ");
//boolean No=sc.nextBoolean();
//int No1=sc.nextInt();
//String name= sc.next();
//System.out.println("No is " + No1);
}

		private void factorial() {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any number ");
			int input=sc.nextInt();
			int i=1;
			int numberbox=1;
			while(i<=input)
			{
				numberbox=numberbox* i;
					i++;
						}System.out.println("Factorial of the number "+ input + " is " + numberbox);
		}
}

