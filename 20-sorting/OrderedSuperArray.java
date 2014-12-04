import java.util.*;

public class OrderedSuperArray extends Sarray {
    public OrderedSuperArray (){
	super();
    }
    // aaron's code helped me see that i could use the add i had already written
    //instead of writing it over
    public void add (String n){
	int length = getData().length;
	int res=0;
	for (int z = 0;z<getData().length;z++){
	    if (getData()[z] == null || n.compareTo(getData()[z]) <=0) {
		res=z;
		break;
	    }
     
	}
	super.add(res, n);
    }
    public String set (int index, String w){
	String old = getData()[index];
	super.remove(index);
	add(w);
	return old;
    }

}

