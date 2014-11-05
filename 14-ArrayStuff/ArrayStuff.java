import java.util.*;
public class  ArrayStuff {

    /*--------------------- Instance Variables --------------------*/ 

    private int[] a;
    Random rnd;

    /*--------------------- Constructors --------------------*/ 

    public ArrayStuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0; i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }

    public ArrayStuff(){
	this(100);
    }
    
    /*--------------------- Methods --------------------*/ 

    public int find (int n){
	int result =0;
	for (int i=0;i<a.length;i++){
	    if (n==a[i]) {
		    result=i;
		    i=a.length;
		}
	    else {
	        result=-1;
	    }
	}
	return result;
    }

    public int maxVal(){
	int result =0;
	for (int i=0;i<a.length;i++){
	    if (a[i]>result){
		result=a[i];
	    }
	}
	return result;
    }
    public int freq(int i){
	int result = 0;
	int number =a[i];
	for (int n=0; n<a.length;n++){
	    if (a[n]==number){
		result++;
	    }
	}
	return result;
    }
    public int mode(){
	int fr = 0;
	int result =0;
	for (int i=0;i<a.length;i++){
	    if (freq(i)>fr) {
		fr=freq(i);
		result=a[i];
	    }
	}
	return result;
    }
    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++) {
	    s = s + a[i]+", ";
	}
	return s;}
    
    /*--------------------- Main --------------------*/ 

    public static void main(String[] args) {
	ArrayStuff as = new ArrayStuff();
	System.out.println(as.toString());
	//	System.out.println(as.find(78));
	//System.out.println(as.maxVal());
	System.out.println(as.mode());
    }
    
}
