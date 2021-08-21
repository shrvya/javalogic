package logicalprograms;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int F0=0;
		int F2;
		int F1=1,n=10;
		System.out.println("printing first 10 fibonacci series");
		System.out.println(F0);//first fibonacci no
		System.out.println(F1);//second fibonacci number
		for(int i=2;i<n;i++)	{
			F2=F1+F0;
			System.out.println(F2);
			F0=F1;
			F1=F2;
		}
		
		

	}

}
