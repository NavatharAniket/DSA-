//based on cards game insert card at there correct pposition
//time complexity best case O(n) worst case O(n2)

class InsertionSort
{
	public static void main(String[] args)
	{
		int[] arr={8, 3, 5, 4, 6};
	
		for(int i=1;i<arr.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}	
				else
				{
					break;
				}
			}
		}

		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}