class may23
{
public static void main(String[] args)
	{
    	int a[]={1,2,2,3,2,4,0};
	int b[]=new int[a.length];
	for(int x=0;x<=a.length-1;x++)
		{
		int count=1;
		for(int y=x+1;y<a.length;y++)
			{
			if(a[x]==a[y])
				{
				count++;
				}
			}
		if(count==1)
		System.out.print(a[x]+" ");
		}
    	}
}