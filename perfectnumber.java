package logicalprograms;

import java.util.Scanner;

public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number:");
		n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			
			if((n%i)==0)//checks divisibility of number
			{
				sum+=i;//sum of all divisors
				System.out.println("divisors: "+i);
			}
			
		}
		System.out.println("sum of divisors is  :"+sum);
		if(sum==n)//if sum of divisors is equal to number
		{
			System.out.println(n+ " is a perfect number");
		}
		else {
	        System.out.println("not a perfect number!!");
		}
	}

}
