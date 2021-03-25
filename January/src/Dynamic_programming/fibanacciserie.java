package Dynamic_programming;

public class fibanacciserie {

	public fibanacciserie() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		//System.out.println(fib(n));
		int strg[]=new int[n+1];
		System.out.println(fibdp(n,strg));
		

	}

	private static int fibdp(int n, int[] strg) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		if(strg[n]!=0)
		{
			return strg[n];
		}
		int f1=fib(n-1);
		int f2=fib(n-2);
		strg[n]=f1+f2;
		return f1+f2;
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		int f1=fib(n-1);
		int f2=fib(n-2);
		return f1+f2;
	}

}
