package Assignment2Nov;

public class SmallestMissingElement {
	public static void main(String args[]) {
		
		int nums[]= {0, 1, 2, 6, 9, 11, 15};
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]+1==nums[i+1]) {
				continue;
			}
			else {
				System.out.println(nums[i]+1);
				break;
			}
		}
	}
}
