package Dynamic_programming;

public class goldmine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mine = {{10, 33, 13, 15},
		        {22, 21, 04, 1},
		        {5, 0, 2, 3},
		        {0, 6, 14, 2}};
		        System.out.println(goldminemax(mine));

	}
	public static int goldminemax(int costs[][])
	{
		int rowMax=costs.length-1;
		int colMax=costs[0].length-1;
		int gold[][]=new int[rowMax+1][colMax+1];
		for(int i=0;i<colMax;i++)
		{
			gold[i][colMax]=costs[i][colMax];
		}
		 for(int j=colMax-1;j>=0;j--){
	            for(int i=0;i<=rowMax;i++){
	                if(i==0){
	                    int max = Math.max(costs[i+1][j+1],costs[i][j+1]);
	                    costs[i][j] = gold[i][j]+max;
	                }else if(i==rowMax){
	                    int max = Math.max(costs[i-1][j+1],costs[i][j+1]);
	                    costs[i][j] = gold[i][j]+max;
	                }else{
	                    int max = Math.max(costs[i+1][j+1],Math.max(costs[i-1][j+1],costs[i][j+1]));
	                    costs[i][j] = gold[i][j]+max;
	                }
	            }
	        }

	        int ans = Integer.MIN_VALUE;
	        for(int i=0;i<=rowMax;i++){
	            if(costs[i][0]>ans){
	                ans = costs[i][0];
	            }
		
	}return ans;
	        

}
}
