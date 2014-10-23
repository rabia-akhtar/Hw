public class Array {
    public int[] frontPiece(int[] nums) {
	int[] intArray;
	intArray = new int[2];
	int n= nums.length;
	if (n<2){
	    return nums;
	}
	else {
	    intArray[0]=nums[0];
	    intArray[1]=nums[1];
	    return intArray;}
    }
    public int sum13(int[] nums) {
	int result = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i]==13) i+=1;
	    else result+=nums[i];
	 
	}
	return result;
    }
}