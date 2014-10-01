// Rabia Akhtar 
public class Shapes {
    //pulled from classcode
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
    /*I had to scratch the work we did in class for tri1 (too many errors) and
      once i started over it took me about 4 minutes to write it */
    public String tri1(int h){
	int n = h;
	int c = 1;
	String result ="";
	while (c<=n){
	    int g =1;
	    while (g<=c){
		result +="*";
		g+=1;
	    }
	    result+="\n";
	    c+=1;
	}
	return result;
    }
    /* It took me around 7 minutes to do tri2. That was only after 
     I took out a pen and paper and tried to imitate how the computer
     was running through my code. This way I was able to
     find my errors more quickly.  */
    public String tri2(int h){
	int n =h;
	int c = 1;
	String result ="";
	while (c<=h){
	    int g =n;
	    while (g>c){
		result +=" ";
		g-=1;
	    }
	    while (g<=c && g>0){
		result+="*";
		g-=1;
	    }
	    c+=1;
	    result+="\n";
	}
	return result;
    }

}