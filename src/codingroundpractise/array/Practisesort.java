package codingroundpractise.array;

import java.util.Arrays; 
class Practisesort
{
	public static void main(String[] args) 
	{
		int temp;
	
		int [] a={10,11,14,18,16,21,10,10,36,38,2};
																		//  Arrays.sort(arr) 
		Arrays.sort(a);

		System.out.println("Asscending order of array is =");
		for (int i=0;i<a.length;i++ ) 
		{
			System.out.println(a[i]);		
		}
		
	}
}