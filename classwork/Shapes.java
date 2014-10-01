
public class Shapes {
    public String box(int r, int c) {
	String s = "";

	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }
    public String tri1(int h){
	int rowcounter = h;
	String result = "";
	while (rowcounter >0){
       	    int counter =1;
	    while (counter<h){
		result += "*"
		counter+=1;
	  	    }
	    result+="\n";
	    rowcounter -=1;
	}
	return result;
    }
}
