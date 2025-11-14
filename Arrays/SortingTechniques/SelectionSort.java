//Find Smallest Element and Swap to First 
//best and worst time complexity is O(n2)
class SelectionSort
{
	public static void main(String[] args)
	{
		int[] arr={5, 3, 8, 4, 2};

		for(int i=0;i<arr.length;i++)
		{
			
			
			int minInx=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[minInx]>arr[j])
				{
					minInx=j;
					
				}
			}

			int temp=arr[minInx];
			arr[minInx]=arr[i];
			arr[i]=temp;
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}
}