public class Driver {
    public static void main(String[] args){
        String s="rabia akhtar";
	int a = s.indexOf(" ");
	String firstName = s.substring (0,a);
	System.out.println (firstName);
	int b = s.indexOf(" ")+ 1;
	String lastName = s.substring (b);
	System.out.println (lastName);

}

}