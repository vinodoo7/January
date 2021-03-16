

package Homework_Arrays;


//Question: https://www.geeksforgeeks.org/find-subarray-with-given-sum/

public class subarrayTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {15,3,7,1,9,2};
		subarraysum(a,11);//Time complexity O(n^2) space O(1)

		subarraysum_reducecomplexity(a,11,a.length); //Time complexity O(n) space O(1)

	}

	private static void subarraysum(int[] a, int target) {
		// TODO Auto-generated method stub
		
			int cursum=0;
			for(int i=0;i<a.length;i++)
			{
				
				cursum=0;
				for(int j=i;j<a.length;j++)
				{
					cursum+=a[j];
					//System.out.println(i+" "+(j));
					
						if(cursum==target)
						{
							System.out.println(i+" "+(j));
							break;
						}
						else if(cursum>target)
						{
						
						}
						
						//System.out.println(i+" "+j+" ");
					
				}
				
				//System.out.println(cursum);
			}
		}
	
	public static void subarraysum_reducecomplexity(int[] arr, int sum,int n) {
		//int a[]= {3,7,1,9,2};
//		int l=0;
//		int sum=a[0];
//		for(int i=1;i<=a.length;i++)
//		{
//			System.out.println(l+" "+(i-1));
//
//			while(sum>target && l<i-1)
//			{
//				sum=-a[l];
//				l++;
//			}
//			if(sum==target)
//			{
//				System.out.println("vi");
//				
//			}
//			if(i<a.length)
//			{
//				sum+=a[i];
//			}
		int curr_sum = arr[0], start = 0, i; 
		  
        // Pick a starting point 
        for (i = 1; i <= n; i++) { 
            // If curr_sum exceeds the sum, 
            // then remove the starting elements 
        	System.out.println(start+" "+(i-1));
            while (curr_sum > sum && start < i - 1) { 
                curr_sum = curr_sum - arr[start]; 
                start++; 
            } 
  
            // If curr_sum becomes equal to sum, 
            // then return true 
            if (curr_sum == sum) { 
                int p = i - 1; 
                System.out.println( 
                    "Sum found between indexes " + start 
                    + " and " + p); 
                
            } 
  
            // Add this element to curr_sum 
            if (i < n) 
                curr_sum = curr_sum + arr[i]; 
        } 
			
			
		}
	}
		
	


