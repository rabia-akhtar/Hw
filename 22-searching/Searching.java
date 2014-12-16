import java.util.*;
public class Searching {
    static Random r = new Random();
    private Comparable[] a;
    public Searching (int num) {
	a = new Comparable [num];
    }
    public String toString(){
	return Arrays.toString(a);
    }
    public void additem (Comparable thing){
	for (int i=0;i<a.length;i++){
	    if (a[i]==null){
		a[i]=thing;
		break;
	    }
	}
    }
    public void additem (Comparable thing, int index){
	for (int i=0;i<a.length;i++){
	    if (i==index){
		a[i]=thing;
		break;
	    }
	}
    }
    public void s(){
	Arrays.sort(a);
    }

    public Comparable lsearch(Comparable thing){
	for (int j=0; j<a.length;j++){
	    if (a[j]==thing){
		return thing;
	    }
	}
	return null;
	    
	
    }

    public Comparable bsearch(Comparable thing) {
	int high=a.length-1;
	int low=0;
	int middle;
	while(low<=high){
	    middle=(high+low)/2;
	    if (a[middle].compareTo(thing) == 0){
		return a[middle];
	    }
	    if (a[middle].compareTo(thing) < 0){
		low= middle + 1;
	    }
	    else{
		high= middle - 1;
	    }
	}
	return null;
    }

    public Comparable rbhelper(Comparable thing, int low, int high) {
	int middle = (low +high) / 2;
	if (a[middle].compareTo(thing)<0) {
	    return rbhelper (thing, middle + 1, high);
	}
	if (a[middle].compareTo(thing)>0) {
	    return rbhelper(thing,low,middle - 1);
	}
	else return thing; 
	
    }
    

    public Comparable rbsearch (Comparable thing) {
	return rbhelper(thing,0,a.length-1);
	    }
    public static void main(String[] args) {
	Searching list = new Searching(10);
	for (int i=0; i<10; i++) {
	    list.additem(r.nextInt(100));
	}
	System.out.println(list.toString());
	list.additem(78,5);
	list.s();
	System.out.println(list.toString());
	System.out.println(list.rbsearch(78));
    }




}