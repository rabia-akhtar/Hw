public class Frame {
    public String frame(int r, int c){
	int n = r;
	String result = "";
	if (n=r){
	    for (int i=0;i<c;i++){
		result+="*";
	    }
	    result+="\n";
	    n-=1;
	}
	else {
	    if (n !=r && n>0){
		for (int i=1;i<c;i++){
		    if (i==c ||i==1){
			result+="*";
		    }
		    else {
			result +=" ";
		    }
		}
	    }
	}
    
	return result;
    }

		}
