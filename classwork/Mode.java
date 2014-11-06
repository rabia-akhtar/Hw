import java.io.*;
import java.util.*;

public class Mode {

    /*----------- Instance Variables --------*/
    int[] a;
    Random r;

		
    /*----------- Constructors --------*/
    public Mode() {
	this(20,100);
    }

    public Mode(int n) {
	this(n,100);
    }

    /*
      n - size of the array
      m - max value for each element
    */
    public Mode(int n,int m){
	r = new Random();
	a = new int[n];
	for (int i=0;i<n;i++){
	    a[i] = r.nextInt(m);
	}
    }


    public int mode(){
	int modeSoFar=a[0],
	    modeCount=freq(a[0]);
				
	for (int i=0;i<a.length;i++){
	    if (freq(a[i])>modeCount){
		modeSoFar = a[i];
		modeCount = freq(a[i]);
	    }
	}
	/* just for testing purposes */
	System.out.println("Modecount: "+modeCount);
	return modeSoFar;
    }

		
    /*----------- methods --------*/

    public String toString() {
	String s = "";
	for (int i=0;i<a.length;i++)
	    s = s  + a[i]+", ";
	return s;
    }

    public int freq(int n){
	int count = 0;
	for (int i=0;i<a.length;i++){
	    if (a[i] == n){
		count = count + 1;
	    }
	}
	return count;
    }
    public int maxVal(int [] nums){
	int maxsf=a[0];
	for (int i=0;i<nums.length;i++){
	    if (nums[i]>maxsf) maxsf=nums[i];
	}
	return maxsf;
    }
    public int maxIndex(int[] nums){
	int maxi=0;
	for (int i=0;i<nums.length;i++){
	    if (nums[i]>nums[maxi]) maxi=i;
	}
	return maxi;
    }
    public int fastmode(){
	int max = maxVal(a);
	int [] tally = new int [max+1];
	for (int i=0;i<a.length;i++){
	    tally[a[i]]++;
	}
	int result = maxIndex(tally);
	return result;
    }



    /*----------- main --------*/

    public static void main(String[] args) {
	int arraylength=20,
	    maxvalue=20;

	if (args.length > 0) {
	    arraylength = Integer.parseInt(args[0]);
	}
	if (args.length > 1) {
	    maxvalue = Integer.parseInt(args[1]);
	}
				
	Mode m = new Mode(arraylength,maxvalue);
	// System.out.println(m);
	System.out.println(m);
       
	System.out.println("Mode value: "+m.fastmode());
    }

}
