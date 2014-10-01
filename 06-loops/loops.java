public class Loops {
    public String frontTimes(String str, int n) {
	//7 minutes 
	int e = str.length();
	String s = "";
	if (e<=3) {
	    while (n>0) {
		s = s +str;
		n=n-1;
	    }
	}
	else {
	    String z = str.substring(0,3); 
	    while (n>0) {
		s = s + z;
		n=n-1;
	    }}
	return s;
    }
    public String stringBits(String str) {
	// 5 minutes
	int length = str.length();
	int n =0;
	String s ="";
	while (n<length) {
	    s = s + str.substring(n,n+1);
	    n=n+2;
	}
	return s;
    }

    public String stringYak(String str) {
	//1 minute 
	String s = str.replaceAll("yak","");
	return s;
    }

    public int stringMatch(String a, String b) {
	// 9 minutes
	int n =0;
	if (a.length()< b.length()) n = a.length();
	else  n = b.length();
	int i = 0;
	int r =0;
	while (i<n-1) {
	    if ((a.charAt(i)==b.charAt(i)) && (a.charAt(i+1)==b.charAt(i+1))) r+=1;
	    i+=1;
	}
	return r;
    }