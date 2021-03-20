package Dynamic_programming;

public class RatInaMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=2;
		int c=2;
		System.out.println(countMazePath(r,c));

	}
	public static int countMazePath(int dr, int dc) {
        int[][] strg = new int[dr + 1][dc + 1];
        for (int i = dr; i >= 0; i--) {
            for (int j = dc; j >= 0; j--) {
                if (i == dr && j == dc) {
                    strg[dr][dc] = 1;
                } else if (i == dr) {
                    strg[i][j] = strg[i][j + 1];
                } else if (j == dc) {
                    strg[i][j] = strg[i + 1][j];
                } else {
                    strg[i][j] = strg[i + 1][j] + strg[i][j + 1];
                }
            }
        }

        return strg[0][0];
    }

    public static int countMazePath2(int dr,int dc){
        int[][] strg = new int[dr+1][dc+1];
        for(int i=0;i<=dr;i++){
            for(int j=0;j<=dc;j++){
                if(i==0&&j==0){
                    strg[0][0] = 1;
                }else if(i==0){
                    strg[i][j] = strg[i][j-1];
                }else if(j==0){
                    strg[i][j] = strg[i-1][j];
                }else{
                    strg[i][j] = strg[i-1][j]+strg[i][j-1];
                }
            }
        }

        return strg[dr][dc];
    }
    
//    public static int mincost(int arr[][])
//    {
//    	
//    }

	

}
