package Homework_Arrays;

public class RearrangePositiveAndNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,-3,-2,-3,-2};
		pivot(arr);

	}

	private static void pivot(int[] arr) {
		// TODO Auto-generated method stub
		int pivot=0;
		int i=-1;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]<0)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		int positiv=i+1;
		int neg=0;
		
		while( positiv<arr.length && arr[neg]<0 )
		{
			int temp=arr[neg];
			arr[neg]=arr[positiv];
			arr[positiv]=temp;
			positiv++;
			neg+=2;
			
			
			
		}
		
	for(int k=0;k<arr.length;k++)
	{
		System.out.print(arr[k]+" ");
	}
}

}
