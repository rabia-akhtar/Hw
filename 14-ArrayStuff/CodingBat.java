public class CodingBat{

    public int sum67(int[] nums) {
	int sum=0;
	for (int i=0;i<nums.length;i++){
	    if (nums[i]==6){
		while (nums[i] !=7){
		    i++;
		}}
	    else sum+=nums[i];
	}
	return sum;
    }
    public boolean more14(int[] nums) {
	int one =0;
	int four =0;
	for (int i =0;i<nums.length;i++){
	    if (nums[i]==1) one++;
	    if (nums[i]==4) four++;
	}
	if (one>four) return true;
	else return false;
    }

    public int[] tenRun(int[] nums) {
	for (int i=0;i<nums.length;i++){
	    int a = nums[i];
	    if ((a%10)==0){
		int n=i+1;
		while (n<nums.length && (nums[n]%10)>0){
		    nums[n]=a;
		    n++;
		}
		i=n-1;
	    }
	}
	return nums;
    }
    public boolean tripleUp(int[] nums) {
	int z =0;
	for (int i=0;i<nums.length-2;i++){
	    int a = nums[i];
	    int b =nums[i+1];
	    int c = nums[i+2];
	    if ((a+2==b+1) && (a+2==c)) z++;
	}
	if (z>0) return true;
	else return false;
    }
    public boolean canBalance(int[] nums) {
	boolean result = false;
	for (int i =0;i<nums.length;i++){
	    int sone=0;
	    int stwo=0;
	    for (int a =0;a<=i;a++){
		sone+=nums[a];
	    }
	    for (int b = i+1; b<nums.length; b++){
		stwo+=nums[b];
	    }
	    if (sone==stwo) result =true;
	}
	return result;
  
    }
    public int[] seriesUp(int n) {
	int length = ((n+1)*n)/2;
	int[] result = new int[length];
	int counter =0;
	for (int i =1;i<=n;i++){
	    for (int a = 1; a <= i; a++,counter++)
		result[counter] = a;}
	return result;
    }