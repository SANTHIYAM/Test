
public class max_product_logic {

	static int max_product(int arr[])
	{
		int max_value=0;
		int n = arr.length; 
		max_value=arr[n-1]*arr[n-2]*arr[n-3];
		System.out.println("array values "+arr[n-1]+"\t"+arr[n-2]+"\t"+arr[n-3]);
		return max_value;
	}
}
