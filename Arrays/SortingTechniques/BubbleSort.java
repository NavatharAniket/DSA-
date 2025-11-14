//compare 2 elements and sort and swap them and big element is on last 
class BubbleSort
{
	public static void main(String[] args)
	{
		int[] arr={5, 3, 8, 4, 2};
		
		//Bubble  sort => time complexity best case O(n) and worst case o(n2)

		for(int i=0;i<arr.length;i++)
		{
			boolean  flag = true;
			for(int j=0;j<arr.length-1-i;j++)
			{
				
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag = false;
				}

				
			}
			if(flag)
			{
				break;
			}
		}

		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	
}