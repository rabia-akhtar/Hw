public class Sarray {
    int[] data= new int[10];
    int last;

    public Sarray() {
	last=-1;
	
        // set up the initial instance variables
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < data.length; i++) {
	    s = s + data[i]+", ";
	}
	return s;
    }

    public boolean add(int n){
        // adds an item to the end of the list, grow if needed
        // returns true
	if (last==data.length){
	    int []newdata=new int[data.length+1];
	    for (int i=0;i<newdata.length;i++){
		newdata[i]=data[i];
	    }
	    newdata[newdata.length-1]=n;
	    data=newdata;
	}
	else {
	    data[last+1]=n;
	}
	return true;
	    
    }

    public void  add(int index, int n){
	// adds item i at index, shifting everything down as needed.
	// also grows as needed 
	if (index<=data.length+1){
	    int []newdata=new int[data.length+2];
	    for (int i=0;i<newdata.length;i++){
		int num=i;
		if (i==index){
		    newdata[i]=n;
		}
		else{
		    if (num<data.length){
			newdata[i]=data[num];
			num++;
		    }
		    else num++;
		}
	    }
	    data=newdata;
	}
	else{
	    int[]newdata=new int[index+1];
	    for (int i=0;i<data.length;i++){
		newdata[i]=data[i];
	    }
	    newdata[index]=n;
	    data=newdata;
	}
    }

  
    public int size() {
	// returns the number of items in the list (not the array size)
	int size=0;
	for (int i=0;i<data.length;i++){
	    if (data[i]!=0)size++;
	}
	return size;
    }
    public int get(int index) {
	// returns the item at location index of the list
	return data[index];
	/* I'm not sure if this means to exclude the 0's*/
    }

    public int set(int index, int i){
	// sets the item at location index to value i
	// returns the old value. 
	int old=data[index];
	data[index]=i;
	return old;
    }


    public int remove(int index){
	// removes the item at index i
	// returns the old value
	int old=data[index];
	data[index]=0;
	return old;

    }



}


