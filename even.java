import java.util.Scanner;
class even
{
	public static void main(String args[])
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n for the range");
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		}
	}
	
	
}