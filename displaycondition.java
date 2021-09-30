import java.util.*;
public class Displaycondition 
{
	public static void main(String[] args) 
	{
		Scanner src = new Scanner(System.in);
		  int count=0,count1=0,count2=0,count3=0,count4=0;
		  int size=10,i=0;
		  System.out.println("Enter the 10 integer : ");
		  int array[] =new int[size];
	      for( i=0; i<size; i++)  
           {  
            array[i]=src.nextInt(); 
		    }
			for(i=0;i<size;i++)
			   {
				if(array[i]>0 )
				   {
					count++;
				   }
				 if(array[i]<0)
			      {
					count1++;
			       }
				   if(array[i]==0)
				   {
					   count2++;
				   }
				  if(array[i]%2 != 0)
				   {
					   count3++;
				   }
				    if(array[i]%2 == 0)
				   {
					   count4++;
				   }
			   }
			   if(count>= 0)
			   {
				   System.out.println("Totally "+count+" positive number");
			   }
				
			   if(count1>=0)
			   {
				   System.out.println("Totally "+count1+" negative number");
			   }
			   if(count2>=0)
			   {
				   System.out.println("Totally "+count2+" zero number");
			   }
			   if(count3>=0)
			   {
				   System.out.println("Totally "+count3+" odd number");
			   }
			   if(count4>=0)
			   {
				   System.out.println("Totally "+count4+" even number");
			   }
		   }
	       
}
