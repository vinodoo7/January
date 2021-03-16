package intro;

public class backtracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//printBoardpathreactive(0,10,"");
//printBoardpathproactive(0,10,"");
		//System.out.println(printBoardpathproactive(0,10));
//int board[][]=new int[3][3];
  // System.out.println(board(0,0,2,2,""));
		boolean board[][]=new boolean[4][4];
		nqueen(board,0,"");

	}
	
	public static void nqueen(boolean board[][],int row,String ans)
	{
		for(int col=0;col<board[0].length;col++)
			if(isItSafe(row,col,board))
			{
				board[row][col]=true;
				
			}
		
	}
	public static boolean issafe()
	{
		//check vertical
		
		//check diagonal 1
				
		//check diagonal 2
	}
	public static void printBoardpathreactive(int curr,int end,String ans)
	{
		if(curr==end)
		{
			System.out.println(ans);
			return;
		}
		if(curr>end)
		{
			return;
		}
		for(int i=1;i<=6;i++)
		{
			printBoardpathreactive(curr+i,end,ans+i);
		}
	}
	
	public static void printBoardpathproactive(int curr,int end,String ans)
	{
		if(curr==end)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i=1;i<=6;i++)
		{
			if(curr+i<=10)
			{
				printBoardpathproactive(curr+i,end,ans+i);

			}
		}
	}
	//Stores locally
	public static int printBoardpathproactive(int curr,int end)
	{
		if(curr==end)
		{
			return 1;
		}
		if(curr>end)
		{
			return 0;
		}
		int count =0;
		for(int i=1;i<=6;i++)
		{
			if(curr+i<=10)
			{
				count+=printBoardpathproactive(curr+i,end);

			}
		}
		return count;
	}
	
	public static int board(int row,int col,int rowend,int colend,String ans)
	{
		
		if(row==rowend && col==colend)
		{
			
			return 1;
		}
		if(row>rowend || col>colend)
		{
			return 0;
		}
	
		int count=0;
		count+=board(row,col+1,rowend,colend,ans+"H") ;
				count+=		board(row+1,col,rowend,colend,ans+"V") ;
						count+=board(row+1,col+1,rowend,colend,ans+"D");
		return count;
		
	}

}
