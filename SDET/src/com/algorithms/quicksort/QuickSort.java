package com.algorithms.quicksort;

import java.util.Arrays;

public class QuickSort 
{
	public static void main(String[] args) 
	{
//		int[] arr = {10, 80, 30, 90, 40, 50, 70}; // {10,30,40,50,80,90,70}
		int[] arr = {10, 80, 30, 90, 40, 70, 70};
		int n = arr.length;
		
		quickSort(arr,0,n-1);
		for (int i : arr) 
		{
			System.out.print(i+" ");
		}
	}
	
	static void quickSort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			int pi = partition(arr,low,high);
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}
	
	static int partition(int[] arr,int low,int high)
	{
		int i=(low - 1);
		int pivot = arr[high];
		
		for (int j = low; j <= high-1; j++) 
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,j,i);
			}
		}
		swap(arr,high,i+1);
		return i+1;
	}
	
	static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
