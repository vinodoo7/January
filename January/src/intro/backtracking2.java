package intro;
import java.util.*;
public class backtracking2 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	//	int a[]= {2,1,4,5,6};
//		//int k=3;
//		//ArrayList<ArrayList<Integer>()> list=new ArrayList<ArrayList<>()>();
//		//String s="";
//		//HashSet<String> dictionary=new HashSet<>();
//		//wordbreak(s,"",dictionary);
//	//	System.out.println("helo");
//		//boolean[][] board=new boolean[4][4];
////	printNQueens(board,0,"");
//	//	nqueen(board,0,"");
//		//print_lexicorgraphy(1,1000);
//	//	int[][] board = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
//	//			{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
//	//			{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
//	//	System.out.println(sudoko(board));
//	
//	  ArrayList<String> ls=new ArrayList<>();
//	  balanceparanthesis("()())()","",0,0,7,ls); int max=0; for(String str:ls) {
//	  max=Math.max(str.length(), max); } for(String str:ls) { if(str.length()==max)
//	  { System.out.println(str); } }
//	 
//		HashSet<String> hset = new HashSet<>();
//		hset.add("i");
//		hset.add("like");
//		hset.add("sam");
//		hset.add("sung");
//		hset.add("samsung");
//		hset.add("mobile");
//		hset.add("ice");
//		hset.add("and");
//		hset.add("cream");
//		hset.add("icecream");
//		hset.add("man");
//		hset.add("go");
//		hset.add("mango");
//		wordbreak("ilikeicecreamandmango", "", hset);
//		wordbreak("ilikesamsungmobile","",hset);
		
		int a[]= {2,1,4,5,6};
		ArrayList<ArrayList<Integer>> ls=new ArrayList<ArrayList<Integer>>();
		//kpartition(a,)
	}
	
	//public static void kpartition()
	
	public static void wordbreak(String que,String ans,HashSet<String> dc)	{
		if(que.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<que.length();i++)
		{
			String cut=que.substring(0,i+1);
			//System.out.println("0,i cut: "+ i +" "+cut);
			if(dc.contains(cut))
			{
				String resq=que.substring(i+1);
				//System.out.println(" resq i:: "+i+" "+resq);
				wordbreak(resq,ans+cut+"-",dc);
			}
			
		}

	}
	
	public static void balanceparanthesis(String que,String ans,int obct,int cbct,int n, ArrayList<String> ls)
	{
		if(cbct>obct)
		{
			return;
		}
		if(obct>(n/2))
		{
			return;
		}
		if(que.length()==0)
		{
			if(obct==cbct)
			{
				ls.add(ans);
				//System.out.println(ans);
			}
			
			return;
		}
		char c=que.charAt(0);
		String res=que.substring(1);
		if(c=='(')
		{
			balanceparanthesis(res,ans+c,obct+1,cbct,n,ls);
		}
		else
		{
			balanceparanthesis(res,ans+c,obct,cbct+1,n,ls);
		}
		balanceparanthesis(res,ans,obct,cbct,n,ls);

		
		
	}
	
	public static boolean sudoko(int[][] board)
	{
		int row=-1;
		int col=-1;
		boolean isfilled=true;
		outer: for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[0].length;j++)
			{
				if(board[i][j]==0)
				{
					row=i;
					col=j;
					isfilled=false;
					break outer;
				}
			}
		}
		if(isfilled)
		{
			for(int i=0;i<board.length;i++)
			{
				for(int j=0;j<board[0].length;j++)
				{
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			return true;
		}
		for(int k=1;k<=9;k++)
		{
			if(issafe(k,row,col,board))
			{
				board[row][col]=k;
				if(sudoko(board)==true)
				{
					return true;
				}
				else
				{
					board[row][col]=0;
				}
			}
		}
		return false;
	}
	
	public static boolean issafe(int k,int row,int col,int[][] board)
	{
		for(int i=0;i<=row;i++)
		{
			if(board[i][col]==k)
			{
				return false;
			}
		}
		
		for(int j=0;j<=col;j++)
		{
			if(board[row][j]==k)
			{
				return false;
			}
		}
		int sqrt=(int)Math.sqrt(board.length);
		int boxrowstart=row-row%sqrt;
		int boxcolstart=col-col%sqrt;
		for(int i=boxrowstart;i<boxrowstart;i++)
		{
			for(int j=boxcolstart;j<boxcolstart;j++)
			{
				if(board[i][j]==k)
				{
					return false;
				}
			}
		}
		return true;
		
		
	}
	public static void print_lexicorgraphy(int start,int end)
	{
		System.out.println(start);
		for(int i=0;i<=9;i++)
		{
			if(start*10+i<end)
			{
				print_lexicorgraphy(start*10+i,end);
			}
		}
		if(start<9)
		{
			
			print_lexicorgraphy(start+1,end);
		}
		
		
		 
	}
	/*public static void printNQueens(boolean[][] board, int row, String asf) {
		if (row == board.length) {
			System.out.println(asf);
			return;
		}

		for (int col = 0; col < board[0].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				printNQueens(board, row + 1, asf + "[" + row + "-" + col + "]");
				board[row][col] = false;
			}
		}
	}

	private static boolean isItSafe(boolean[][] board, int row, int col) {
//		for column
		for (int i = 0; i < row; i++) {
			if (board[i][col] == true) {
				return false;
			}
		}
//		diagonal 1
		int r = row - 1;
		int c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}

//		diagonal 2
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board.length) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}*/
	
	public static void printNQueens(boolean[][] board,int row,String asf)
	{
		if(row == board.length)
		{
			System.out.println(asf);
			return;
		}
		for(int col = 0;col < board[0].length; col++)
		{
			if(isITsafe(board,row,col))
			{
				board[row][col] = true;
				printNQueens(board,row+1,asf + "[" + row + "-" + col + "]");
				board[row][col] = false;
			}
		}
	}
	private static boolean isITsafe(boolean[][] board,int row,int col)
	{
		//check column
		for(int i = 0;i < row; i++)
		{
			if(board[i][col] == true)
			{
				return false;
			}
		}
		//check diagonal 1
		
		int r=row-1;
		int c=col-1;
		while(r >= 0 && c >= 0)
		{
			if(board[r][c] == true)
			{
				return false;
			}
			r--;
			c--;
		}
		
		// check diagonal 2
		r=row-1;
		c=col+1;
		while(r>=0 && c<board.length)
		{
			if(board[r][c]==true)
			{
				return false;
			}
			r--;
			c++;
		}
		return true;
		
	}
	/*public static void wordbreak(String que,String ans,HashSet<String> dictionary)
	{
		for(int i=0;i<=que.length();i++)
		{
			String cutlength=que.substring(0,i);
			if(dictionary.contains(cutlength))
			{
				String rem=que.substring(i);
				wordbreak(rem,ans+cutlength,dictionary);
				
			}
		}
	}
	
	public static void invalidparanthesis(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			
		}
		invalidparanthesis(que,ans+"(")
	}
	/*public static void subsets(int []a,int vdx,ArrayList<ArrayList<>>)
	{
		if(vdx==arr.length)
		{
			System.out.println(list);
			return;
			
		}
		if(list.size()==0)
		{
			list.add(new ArrayList<>());
			list.get(0).add(a[vidx]);
			subsets(a,vdx+1,list,k);
			list.remove(0);
		}
		else
		{
			for(int i=0;i<list.size();i++)
			{
				list.get(i).add(arr[vdx]);
			}
		}
		
	}*/
	

}
