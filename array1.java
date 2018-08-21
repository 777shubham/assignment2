 class array1
 {
 public static void main(String args[])
    {
       
       int[]a={1,1,1,1,0,0,1,0};
	   int temp;
       for(int i=0;i<a.length-1;i++)
       {
        for(int j=0;j<a.length-i-1;j++)
		{
			if(a[j+1]<a[j])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			
		}			
       }
	   for(int i=0;i<a.length-1;i++)
	   {
		   System.out.print(a[i]+" ");
	   }
    }
 }