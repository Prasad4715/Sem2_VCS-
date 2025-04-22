public class AlphabeticTriangle
{
	public static void main(String args[])
	{
		int n=5;
		char array[]={'a','b','c','d','e'};
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(array[i]);
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();
		}
		
		
	}
}