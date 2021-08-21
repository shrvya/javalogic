package logicalprograms;

import java.util.Scanner;

public class stopwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start;
		long starttime=0,stoptime=0,duration=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number 1 to start:");
		start=sc.nextInt();
		if(start==1)
		{
		   	starttime=System.currentTimeMillis();//gives the startime in millisec
		   	System.out.println("starttime is "+starttime);
		}
		Scanner sc1 =new Scanner(System.in);
		System.out.println("enter the number 2 to stop:");
		start=sc1.nextInt();
		if(start==2)
		{
		   	stoptime=System.currentTimeMillis();//gives stoptime
		   	System.out.println("stoptime is "+stoptime);
		}
		duration=stoptime-starttime;//calculates duration
		System.out.println("time duration is "+duration);

	}

}
