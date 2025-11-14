import java.util.Scanner;
/*
Given a unsorted array arr[] of positive integers having all the numbers occurring exactly
twice, except for one number which will occur only once. Find the number occurring only once.

Input: arr[] = [1, 2, 1, 5, 5]
Output: 2
Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.

Input: arr[] = [2, 30, 2, 15, 20, 30, 15]
Output: 20
Explanation: Since 20 occurs once, while other numbers occur twice, 20 is the answer.
*/
class UniqueNumber
{
	public static int uniqueBruteForce(int[] arr)
	{
		for(int i=0;true;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
					count++;
				}
			}
			if(count==1)
			{
				return i;
			}
		}
		
	}


	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter Elements in Arrays ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The Unique Number is "+uniqueBruteForce(arr));
	}
}