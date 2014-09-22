public class Driver {
    public static void main(String[] args){
        String s="rabia akhtar";
	int a = s.indexOf(" ");
	String firstName = s.substring (0,a);
	System.out.println (firstName);
	String lastName = s.substring (a+1);
	System.out.println (lastName);

}

}