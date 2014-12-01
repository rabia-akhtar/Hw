import java.util.*;

public class OrderedSuperArray extends Sarray {
    private String[]data;
    private int last;
    public OrderedSuperArray{
	data = new String [10];
	last=-1;
    }
    public void add (String n){
	int i=0;
	while (i<data.length-1){
	    if (data[i].compareTo(n)>0 && data[i+1].compareTo(n)<=0) {
		String []newdata=new String[data.length+1];
		int j=0;
		int z=0;
		while (j<newdata.length){
		    if (j !=i+1){
		    newdata[j]=data[z];
		    j++;
		    z++;
		    }
		    else{
			newdata[j]=n;
			j++;
			i++;
		    }
		}
	    }
	    else{
		i++;
	    }
	}
    }
}



