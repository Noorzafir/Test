import java.util.*;
//testing vim command in git bash
public class Sorting 
{
	static void preDefinedMethod(int arr[])					// 1
	{
		Arrays.sort(arr);
		System.out.println("Using pre defined method");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void thirdVariable(int arr[])					// 2
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Using thurd variable");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void mergeSort(int arr[])						// 3
	{
		int size = arr.length;
		for(int step=0;step<arr.length-1;step++)
		{
			int minIndex = step;
			for(int i=step+1;i<size;i++)
			{
				if(arr[i]<arr[minIndex])
				{
					minIndex = i;
				}
			}
			int temp  = arr[step];
			arr[step] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println("Using Merge Sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void InsertionSort(int arr[])					// 4
	{
		int size = arr.length;
		for(int step=1;step<size;step++)
		{
			int key = arr[step];
			int j = step-1;
			while(j>=0 && key<arr[j])
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println("Using Insertion Sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int arr[] = {2,4,1,8,9,5,10,12,25,67};
		preDefinedMethod(arr);
		thirdVariable(arr);
		mergeSort(arr);
		InsertionSort(arr);
		
	}
}
