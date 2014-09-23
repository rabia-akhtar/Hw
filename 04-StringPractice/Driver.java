/* Rabia Akhtar 
Hw #4
*/

public boolean mixStart(String str) {
    if (str.length() < 3) {
	return false;
    }
    else { 
	String s1 = str.substring(1,3);
	String s2 = "ix";
	return (s1.equals(s2)) ;}
}

public String makeOutWord(String out, String word) {
    String s1 = out.substring(0,2);
    String s2 = out.substring(2,4);
    return s1 + word + s2;
}

public String firstHalf(String str) {
    int a = str.length()/2;
    String s1 = str.substring(0,a);
    return s1;
}
