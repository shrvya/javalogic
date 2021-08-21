package logicalprograms;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rem,reverse=0;
		System.out.println("enter two digit number");
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       while(n>0)
       {
    	  rem=n%10;//finds the remainder
    	 
    	  reverse=reverse*10+rem;//finds reverse of the number
    	  n=n/10;
  
    	  
       }
       System.out.println(reverse);
	}

}
