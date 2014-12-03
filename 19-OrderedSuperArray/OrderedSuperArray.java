import java.util.*;

public class OrderedSuperArray extends Sarray {
    private String[]data;
    private int last;
    public OrderedSuperArray{
	super();
    }
    // aaron's code helped me see that i could use the add i had already written
    //instead of writing it over
    public void add (String n){
	int res=0;
	int i=0;
	while (i<data.length){
	    if (n.compareTo(data[i]) <=0) {
		res=i;
		break;
	    }
	}
	super.add(n, w);
    }
    public String set (int index, String w){
	String old = data[i];
	super.remove(i);
	add(w);
	return old;
    }

}

