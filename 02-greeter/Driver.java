import java.io. *;
import java.util.*;

public class Driver {
    public static void main (String []args ){
	// declares a local variable g to be of type Greeter 

        Greeter g;
	//	System.out.println(g);
        g = new Greeter();
	/* new does the following 
	   1. Allocates enough memory to store Greeter
	   2. Do whatever's needed to setup / initialize 
	   the memory to be Greeter.
	   3. return the address of the memory that was allocated.

	   The assignment stores the address in g.  

	*/
	// This prints out the memory location of Greeter 
	// System.out.println(g);
	g.greet();
	g.greet();
	g.ungreet();
    }
}

/* 
In Java all variables must be declared before use 
declarations specify the type of variables

Local Variable - declared in a method
It is created when a function is called and destroyed
when a function exits and is only visible (usable) inside 
the method. 

private - can only be accessed from within the class its declared in 
public - can be accessed from pretty much anywhere

we can gain access to private stuff by calling public methods that 
can access the private stuff

String - a built in Java class like in Python. Strings are immutable. 

Attributes are instance variables.... kind of like turtle variables.
*/

