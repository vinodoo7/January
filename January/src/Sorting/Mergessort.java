package Sorting;

public class Mergessort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,8,3,22,55,11};
		for(int f:arr)
		{
			//System.out.print(f+" ");
		}
		Dividearrayintotwo(arr,0,arr.length-1);
		for(int f:arr)
		{
			System.out.print(f+" ");
		}
	}

	private static void Dividearrayintotwo(int[] arr,int lo,int up) {
		if(lo<up)
		{
			int mid=lo+(up-lo)/2;
			//System.out.println(arr[lo]+" "+arr[mid]);
			Dividearrayintotwo(arr,lo,mid);
			Dividearrayintotwo(arr,mid+1,up);
			MergeTwosortedarray(arr,lo,mid,up);
		
		}
		
	}

	private static void MergeTwosortedarray(int[] arr, int lo, int mid, int up) {
		// TODO Auto-generated method stub
		int size1=mid-lo+1;
		int size2=up-mid;
		
		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
		
		
		for(int i=0;i<size1;i++)
		{
			arr1[i]=arr[lo+i];
		}
		
		for(int i=0;i<size2;i++)
		{
			arr2[i]=arr[mid+1+i];
		}
		
		int i=0;
		int j=0;
		int k=lo;
		
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				arr[k]=arr1[i];
				
				i++;
			}
			else
			{
				arr[k]=arr2[j];
				
				j++;
			}
			k++;
		}
		
		while(i<size1)
		{
			arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<size2)
		{

			arr[k]=arr2[j];
			j++;
			k++;
			
		}
		
	}

	

}
