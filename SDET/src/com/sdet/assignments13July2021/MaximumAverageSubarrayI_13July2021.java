package com.sdet.assignments13July2021;

/*
 * 
 * You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.


Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000

k=4
		i
num		1 12 -5 -6 50 3
		0  1  2  3  4 5
		
for loop 1:
i=0
i<k
sum = 1+12-5-6 = 2

int prevSum = sum

i=k
i<num.length

sum = sum+num[i] - num[i-k]
sum = 2 + 50 - 1 = 51

prevSum = Math.max(sum, prevSum);

i=5
i<6

sum = sum+num[i] - num[i-k] = 51 + 3 -12 = 42
prevSum = Math.max(sum, prevSum);

prevSum = 51

double average = prevSum/k = 


 * 
 * 
 */

public class MaximumAverageSubarrayI_13July2021 {

}
