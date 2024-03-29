package Arrays;

public class SumOfArray {
	
	public static void main(String[] args) {
		int[] arr = {2,5,3,8,19,6,11,15,1};
		int sum=0;
		for(int num:arr) {
			sum+=num;
		}
		System.out.println("Sum of array is : "+sum);
	}
}
