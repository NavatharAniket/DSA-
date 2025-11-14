/*
Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements
in the subsequence are consecutive integers, the consecutive numbers can be in any order.

Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
Output: 6
Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.

Input: arr[] = [1, 9, 3, 10, 4, 20, 2]
Output: 4
Explanation: 1, 2, 3, 4 is the longest consecutive subsequence.

Input: arr[] = [15, 13, 12, 14, 11, 10, 9]
Output: 7
Explanation: The longest consecutive subsequence is 9, 10, 11, 12, 13, 14, 15, which has a length of 7.

*/

import java.util.Scanner;
class LongestConsecutiveElement
{

	public static int Element(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Arrays ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Elements in Arrays ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The Unique Number is "+Element(arr));

	}
}