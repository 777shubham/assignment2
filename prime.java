import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		int n,i,count;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n for the range");
		n=s.nextInt();
		System.out.println("Prime numbers are:");
		for(i=2;i<n;i++)
		{
			count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}	
			}
			if(count==0)
			{
			System.out.println(i);	
			}
			
			
		}
	}
	
	
}