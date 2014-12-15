import java.util.*;
public class Searching {
    private Comparable[] a;
    public Searching (int num) {
	a = new Comparable [num];
    }
    public void additem (Comparable thing){
	for (int i=0;i<a.length;i++){
	    if (a[i]==null){
		a[i]=thing;
		break;
	    }
	}
    }
    public void s(){
	Arrays.sort(a)
	    }

    public Comparable lsearch(Comparable thing){
	for (int j=0; j<a.length;j++){
	    if (a[j]==thing){
		return thing;
	    }
		else return null;
	    
	}
    }

    public Comparable bsearch(Comparable thing) {





    }





 public static void main(String[] args) {
	Searching list = new Searching(10);
	for (int i=0; i<list.length; i++) {
	    s.additem(r.nextInt(100));
	System.out.println(list);
	list.sort();
	System.out.println(list);
	System.out.println(list);
    }



}