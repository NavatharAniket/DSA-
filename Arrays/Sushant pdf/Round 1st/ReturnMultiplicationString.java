/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example 1:
Input: num1 = "2", num2 = "3"
Output: "6"

Example 2:
Input: num1 = "123", num2 = "456"
Output: "56088"
*/

import java.util.Scanner;
class ReturnMultiplicationString
{
	public static String Multi(String str1,String str2 )
	{
		int num1=0,num2=0;
		for(int i=0;i<str1.length()||i<str2.length();i++)
		{
			num1=num1*10+(str1.charAt(i)-'0');
			num2=num2*10+(str2.charAt(i)-'0');
		}

		
		return num1*num2; 
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First String");
		String str1=sc.nextLine();
		System.out.println("Enter Second String");
		String str2=sc.nextLine();

		System.out.println("MultiPlication of both String is "+Multi(str1,str2));
	}
}