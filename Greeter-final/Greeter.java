
public class Greeter {

    private String greeting;
    
    public Greeter() {
	greeting = "Hello world!";
    }

    public void setGreeting(String s) {
	greeting = s;
    }

    public String greetPerson(String s) {
	return greeting+ " " + s;
    }

    public String loudGreeting() {
	return greeting.toUpperCase();
    }

    public String getGreeting() {
	return greeting;
    }
	
    public String greet() {
	return greeting;
    }

    public void ungreet() {
	System.out.println(greeting);
    }
}
