//  Assignment Pyramid Pattern 7


class Pyramid7{

	public static void main(String args[])
	{
	
	
		for(int i=9;i>=1;i--)
		{
			for(int j=8;j>=i;j--)
			{
			System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
			System.out.print(" "+i);
			}
			for(int k1=i-1;k1>0;k1--)
			{
			System.out.print(" "+i);
			}
			
			
			System.out.println();
			
		}
			
	
	}
}	
