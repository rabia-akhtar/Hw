import java.io.*;
import java.util.*;

class Interval {

    private int low,high;
    private Random r = new Random();				
    private static int numIntervals = 0;
		
    public Interval(int l, int h){
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }
		
    public Interval() {
	int l = r.nextInt(100);
	int h = l + 1 + r.nextInt(100);
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }

    public String toString() {
	//String s = "Inteval: "+numIntervals+": "+ "["+low+","+high+"]";
	String s = "["+low+","+high+"]";

	return s;
    }
    public int compareTo(Interval other){
	if (this.low == other.low && this.high == other.high) {
	    return 0; 	}
	else {
	if (this.low == other.low) return this.high - other.high;
	else return this.low - other.low;
	}
    }
    public static void printstuff() {
	System.out.println("Stuff");
    }
    public static void main(String[] args) {

	Interval uno = new Interval();
	Interval dos = new Interval();
	System.out.println(uno.toString());
	System.out.println(dos.toString());
	System.out.println(uno.compareTo(dos));
    }
}
