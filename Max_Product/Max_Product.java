
public class Max_Product {
	

	/* A utility function to print array of size n */
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver program 
	public static void main(String args[]) 
	{
		int arr[] = {1, 10, 2, 6, 5, 3}; 
		int n = arr.length; 
		
		printArray(arr); 
		
		HeapSort ob = new HeapSort(); 
		ob.sort(arr); 

		System.out.println("Sorted array is"); 
		printArray(arr); 
		
		int max=max_product_logic.max_product(arr);
		System.out.println("MAX VALUE"+max);
	} 
	

}
