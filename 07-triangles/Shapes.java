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
    public String tri3(int h) {
	/* this took around 25 minutes to write because typing with 
	   henna on is not a good idea */
	String result="";
	int i,one,two,three;
	int n= h;
	int c=1;
	for (i=0;i<n;i++,h--){
	    for (one=h-1;one>0;one--){
		result +=" ";
	    }
	    two=1;
	    while (two<=(2*c)-1 & c<=((2*n)-1)){
	    result+="*";
	    two+=1;
	}
	    c+=1;
	    result+="\n";
	}
	return result;
    }
    public String diamond(int h){
	// 30 minutes. i think my code should be cleaner than this...
	String result = "";
	int i,one,two,three,f,a,b,d,e;
	int n= h;
	int count=h; 
	int c=h;  
	int cc=h;  
	int z=1;
	int g=h/2;
	e=h-2;
	two=0;
	one=count-1;
	for (i=0;i<(n-2);i++,count--){
	    for (one=count-1;one>1;one--){
		result +=" ";
	    }
	    two=1;
	    while (two<=z && z<=h){
		result+="*";
		two+=1;
	    }
	    z+=2;	  
	    result+="\n";
	}
	for (a=0;a<g;a++,c++){
	    for (b=0;b<(c/2);b++){
		result +=" ";
	    }
	    d=1;
	    while (d<=e && e>=0){
		result+="*";
		d++; 
	    }
	    e-=2;	  
	    result+="\n";
	}
	return result;
    }

 public String tri4(int height){
     // 2 minutes, flipped tri4
	int h;
	int i;
        String s="";
	for (h=height;h>=0;h--){
	    for (i=0;i<height-h;i++){
		s = s + " ";
	    }
	    for (;i<height;i++){
		s=s+"*";
	    }
	    s=s+"\n";
	}
	return s;
    }

    }
