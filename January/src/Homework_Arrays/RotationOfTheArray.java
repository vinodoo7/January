package Homework_Arrays;

public class RotationOfTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,3,1,2,22,33,44,55,66};
		int n=3;
		rotate(arr,n);
		
		// For Left Rotation:  (i+rounds)%arr.length;
		//For Right Rotation: (i+(arr.length-rounds))%arr.length; //////////////n-d
	}

	private static void rotate(int[] arr, int n) {
		// TODO Auto-generated method stub
		int res[]=new int[arr.length];
		if(n>0)
		{
			for(int i=0;i<arr.length;i++)
			{
				int pos=(i+(arr.length-n))%arr.length;
				System.out.println(pos);
				res[pos]=arr[i];
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		
	}

}
