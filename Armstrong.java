import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		 int a=0;
                 int r,c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n to check armstrong");
		int n=s.nextInt();
               
		int temp=n;
		int temp1=n;
		while(temp!=0)
		{
			r=temp%10;
			c++;
			temp=temp/10;
		}
		
		while(temp1!=0)
		{
			r=temp1%10;
			a+=Math.pow(r,c);
			temp1=temp1/10;
		}
		if(a==n)
		{
			System.out.println(n+" is armstrong");
		}
		else
		{
			System.out.println(n+" is not armstrong");
		}

	}
	
	
}