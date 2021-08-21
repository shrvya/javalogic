package logicalprograms;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n,count=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number:");
		n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			
			if((n%i)==0)//checks if the number is divisible by 2 to n
			{
				count++;//counts the no of divisors
			}
			
		}
		if(count==0)
		{
			if(((n%1)==0) && ((n%n)==0))
			{
				System.out.println("the number is a prime number!!!");
			}
		}
		else {
			System.out.println("the number is a not prime number");
		}

	}

}
