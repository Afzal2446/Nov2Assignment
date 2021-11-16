package Assignment2Nov;

public class MissingTerm {
	public static void main(String args[]) {
		int arr[]= {1,2,3,5,6,7,8,9};
		int n=arr.length;
		int sum1=0;
		
		for(int i=0; i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		
		int sum2=((arr[arr.length-1])*(arr[arr.length-1]+1))/2;
		System.out.println(sum2-sum1);
	}
}
