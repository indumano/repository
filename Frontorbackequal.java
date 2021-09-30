public class  Frontorbackequal
{
	public static void main(String[] args) 
	{
		  int array[]={2,6,7,7,6,2};
					 int n=array.length;
					 int flag=0;
					 for(int i=0;i<=n/2 && n!=0;i++)
						{
						 if (array[i]!=array[n-i-1])
						 {
							 flag=1;
							 break;
						 }
						}
						if(flag == 1)
						{
							System.out.println("Array element front and back are not same");
						}
						else
						{
							System.out.println("Array element front and back are same");
						}

	}
}
