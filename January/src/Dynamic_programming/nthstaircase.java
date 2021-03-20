package Dynamic_programming;

public class nthstaircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		//System.out.println(steps(n));
		int strg[]=new int[n+1];
		//System.out.println(stepsMemo(n,strg));
		System.out.println(tabulationsteps(n));

	}


	private static int tabulationsteps(int n) {
		// TODO Auto-generated method stub
		int tab[]=new int[n+1];
		tab[0]=1;
		tab[1]=1;
		tab[2]=2;
		for(int i=3;i<=n;i++)
		{
			tab[i]=tab[i-1]+tab[i-2]+tab[i-3];
		}
		return tab[n];
		
	}


	private static int steps(int n) {
		// TODO Auto-generated method stub
		if(n<0)
		{
			return 0;
		}
		if(n==1 ||n==0)
		{
			return 1;
		}
		return steps(n-1)+steps(n-2)+steps(n-3);
		
	}
	

	private static int stepsMemo(int n,int strg[]) {
		// TODO Auto-generated method stub
		if(n<0)
		{
			return 0;
		}
		if(n==1 ||n==0)
		{
			return 1;
		}
		if(strg[n]!=0)
		{
			return strg[n];
		}
		return strg[n]=stepsMemo(n-1,strg)+stepsMemo(n-2,strg)+stepsMemo(n-3,strg);
	}
	
	

}
