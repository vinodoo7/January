package Dynamic_programming;

public class Mincost2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int strg[][]=new int[3][3];
		//System.out.println(mazeMemorization(1,1,3,3,strg));
		int mat[][] = { { 1, 2, 4 },
                        { 3, 0, 2 },
                        { 4, 0, 1 } };
		System.out.println(mincost1(mat,2,2));
	

	}
	public static int mincost1(int mat[][],int dr,int dc)
	{
        for(int i=0;i<=dr;i++){
            for(int j=0;j<=dc;j++){
                if(i==0&&j==0){
                    mat[0][0] = mat[0][0];
                }else if(i==0){
                    mat[i][j] = mat[i][j-1]+mat[i][j] ;
                }else if(j==0){
                    mat[i][j] = mat[i-1][j]+mat[i][j] ;
                }else{
                    mat[i][j] = Math.min(mat[i-1][j],mat[i][j-1])+mat[i][j] ;
                }
            }
        }

        return mat[dr][dc];
	}
	public static int mincost(int mat[][],int er,int ec)
	{
	    for(int i=er;i>=0;i--)
	    {
	        for(int j=ec;j>=0;j--)
	        {
	            if(i==er && j==ec)
	            {
	                mat[er][ec]=mat[er][ec];
	            }
	            else if(i==er)
	            {
	                mat[i][j]=mat[i][j+1]+mat[i][j];
	            }
	            else if(j==ec)
	            {
	                mat[i][j]=mat[i+1][j]+mat[i][j];
	            }
	            else{
	                mat[i][j]=Math.min(mat[i+1][j],mat[i][j+1])+mat[i][j];
	            }
	        }
	     
	    }
	    return mat[0][0];
	}

}
