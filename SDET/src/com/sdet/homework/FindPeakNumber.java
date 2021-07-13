package com.sdet.homework;

/*
 * 
 * 
 * 
 * 
 */

public class FindPeakNumber 
{
	public static void main(String[] args) 
	{
//		int[] arr = {1,2,3,2,0};
//		int[] arr = {1,2,3,4,5};
		int[] arr = {5,4,3,2,1};
		int max=-1;
		
//		for (int i = 0; i < arr.length-1; i++) 
//		{
//			if(arr[i]<arr[i+1])
//			{
//				max = arr[i+1];
//			}
//			else
//			{
//				max=arr[i];
//				break;
//			}
//		}
//		System.out.println("Peak no is : "+max);
		int flag =1;
		for (int i = 0; i < arr.length-1; i++) 
		{
			if(arr[i]>arr[i+1])
			{
//				max = arr[i];
				System.out.println("Peak no is : "+arr[i]);
				flag=0;
				break;
			}
		}
		if(flag ==1)
		{
			System.out.println("Peak no is : "+arr[arr.length-1]);
		}
	}
}

