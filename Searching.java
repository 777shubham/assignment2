import java.util.Scanner;
 class array2
 {
 public static void main(String args[])
    {
       int count=0;
       int[]a={1,4,6,7,8,9,10};
	System.out.println("Your Array");
	   
	   for(int i=0;i<a.length-1;i++)
	   {
		   System.out.print(a[i]+" ");
	   }
	   
	   Scanner s=new Scanner(System.in);
		System.out.println("\nEnter n to find");
		int n=s.nextInt();
       for(int i=0;i<a.length-1;i++)
       {
        if(n==a[i])
		{
			count++;
			break;
		}
		
       }
	   if(count==1)
		{
			System.out.println(n+" is present");
		}
		else
		{
			System.out.println(n+" is not present");
		}
		
		
	  
    }
 }
