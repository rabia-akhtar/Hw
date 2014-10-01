public class Box {
    public String box (int r, int c){
	int z=0;
	int b=r;
	String result = "";
	while (b>0){
	    z = c;
	    while (z>0) {
		result = result + "*";
		z=z-1;
	    }
	    result = result + "\n";
	    b=b-1;
	}
	return result;
    }
}

