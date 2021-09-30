import java.util.*;
public class  Reversearray
{
	
     public static void main(String[] args) 
	{
		 Scanner src = new Scanner(System.in);
		 int size=10,i=0;
		  System.out.println("Enter the 10 integer : ");
		    int array[] = new int[size];
				 for( i=0; i<size; i++)  
                   {  
                      array[i]=src.nextInt(); 
		            }
					int array2[]=new int[array.length];
					for(i=0;i<size;i++)
				    {
						array2[i]=array[i];
					}
					System.out.println("The reverse element of another array : ");
					for(i=array2.length-1;i>=0;i--)
				     {
                        System.out.print(array2[i]+" ");
					 }
					 System.out.println();
	}
}
