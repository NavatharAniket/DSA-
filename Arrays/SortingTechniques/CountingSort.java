//time complexity O(n+k)
//space complexity O(k)
//best for small integers
//count frequency of all and sort using frequncy

class CountingSort
{
	public static void main(String[] args)
	{
		int[] arr={4, 2, 2, 8, 3, 3, 1};
	
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}

		int[] count=new int[max+1];
 
		for(int k:arr)
		{
			count[k]++;
		}

		
		int i=0;
		int j=0;
		while( i<arr.length &&j<count.length)
		{
			if(count[j]==0)
			{
				j++;
				continue;
			}
			
			arr[i++]=j;
			count[j]--;	
		}
		for(int k:arr)
		{
			System.out.print(k+" ");
		}
	}
}