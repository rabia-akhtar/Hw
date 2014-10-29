public class CodingBat{

    public int sum67(int[] nums) {
	int sum = 0;
	for(int i = 0 ; i < nums.length ; i++){
	    if(nums[i] == 6){
		for (int n=i; nums[i]!=7;n++){
		    sum+=0;
		    i=n;
		}
	    }
	    else {
		sum+=nums[i];
	    }
	}
	return sum;
    
    }
    public boolean more14(int[] nums) {
	int one =0;
	int four =0;
	for (int i=0; i<nums.length;i++){
	    if (nums[i]==1) one+=1;
	    if (nums[i]==4) four+=1;
	}
	if (one>four) return true;
	else return false;
    }
public int[] tenRun(int[] nums) {
  int[]result=new int[nums.length];
  for (int i=0;i<nums.length;i++){
  int a =nums[i];
  if (a%10==0){
  int n;
   for (n=i;((a%10)>0);n++){
    result[n]=a;
    }
   i=n;
  }
  else result[i]=nums[i];
  }
  return result;
}
