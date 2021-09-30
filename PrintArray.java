import java.util.*;
public class PrintArray
{
	public static void main(String[] args) 
	{
	Scanner src = new Scanner(System.in);
	   int n=0;
		int size=n;
		System.out.println("Enter the array size");
		n=src.nextInt();
		if(n<=0)
		{
		 System.out.print("Enter the valid output");
		}
		else
		{
	    System.out.println("Enter the "+n+" integer : ");
		int array[] =new int[n];
	    for(int i=0; i<n; i++)  
        {  
        array[i]=src.nextInt();  
        } 
		System.out.print("output is : ");
		for (int i=0; i<n; i++)   
         {  
          System.out.print(array[i]+" ");  
         }  
		}
	}
}
	  
	 

 