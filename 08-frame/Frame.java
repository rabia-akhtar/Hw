public class Frame {
    public String frame(int r, int c){
	//9 minutes 
	int n = r;
	String result = ""; 
	for (int s=0;s<r;s++) {
	    if (n==r || n==1){
		for (int i=0;i<c;i++){
		    result+="*";
		}
		result+="\n";
		n-=1;
	    }
	    else {
		for (int i=1;i<=c;i++){
		    if (i==c ||i==1){
			result+="*";
		    }
		    else {
			result +=" ";
		    }
		}
		result+="\n";
		n-=1;
	    }
	}
	return result;
    }
    public String stringSplosion(String str) {
	// 2 minutes
	String result = "";
	int n =str.length();
	for (int i=0;i<n;i++){
	    result+= str.substring(0,i+1);
	}
	return result;
    }
    public String stringX(String str) {
	//around 4 minutes
	int len = str.length();
	String result ="";
	for (int i=0; i<len;i++){
	    if ((i==0 || i==len-1)&& str.charAt(i)=='x') {
		result+="x";
	    }
	    else {
		if (str.charAt(i)=='x'){
		    result+="";
		}
		else{
		    result +=str.charAt(i);
		}
	    }
	}
	return result;
  
  
}


}
