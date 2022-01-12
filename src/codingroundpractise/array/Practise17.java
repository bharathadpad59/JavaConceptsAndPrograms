package codingroundpractise.array;

import java.util.Arrays;
class Practise17
{
	public static void main(String[] args) 
	{
		int temp;
	
		int [] a={12,11,14,16,2};
																		//  Arrays.sort(arr) 
		for (int i=0;i<a.length;i++) 
		{
//			System.out.print(a[i]+" ");
			for (int j=i+1;j<a.length;j++) 			// BUBBLE SORTING

			{                                       // SORTING IN ASSCENDING ORDER
				if(a[i]>a[j])
				{
//					System.out.println("a[i] "+a[i]+"compairing with "+a[j]);
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					for(int k=0;k<=a.length-1;k++) {
						System.out.print(a[k]+" ");
						
					}
					System.out.println("");
				}
			}
			
		}	
		//Arrays.sort(a);	
		System.out.println("Asscending order of array is =");
		for (int i=0;i<a.length;i++ ) 
		{
			System.out.println(a[i]);
				
		}
		
		
		
	}
}