package logicalprograms;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class coupon {
	
   
	static Random random=new Random();
	static Scanner sc = new Scanner(System.in);
	public static ArrayList<Integer> distinct=new ArrayList<>();
	
	public static int generaterandom()//generate random no
	{
		return random.nextInt(10);
	}
	
	public static boolean checknumber(int x)//check if random no is present in coupon
	{
		int index=distinct.indexOf(x);
				if(index!=-1)//number is present in coupon
				{
					distinct.remove(index);//remove that number
					return true;
				}
				else return false;
	}
   
	public static void main(String[] args) {
		int n;
		System.out.println("Enter number of digits");
		n=sc.nextInt();
		System.out.println("Enter  digits");
		for(int i=0;i<n;i++)
		{
			distinct.add(sc.nextInt());//enter coupon number
		}
		
		 int randomcount=0;
		 int count=0;
		while(count<n)
		{
			while(true)
			{
				int x=generaterandom();
				randomcount++;//counts number of random numbers
				boolean check=checknumber(x);
				if(check)
					break;
			}
			count++;
		}
       System.out.println("random nos is"+randomcount);		
}
}
