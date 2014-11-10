public class Sarray {
    int[] data= new int[10];
    int last;

    public Sarray() {
	last=0;
	
        // set up the initial instance variables
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
	}
	else {
	    data[last+1]=n;
	}
	return true;
	    
    }
    /*
    public void  add(int index, int i){
        // adds item i at index, shifting everything down as needed.
        // also grows as needed 
    }

    public int size() {
        // returns the number of items in the list (not the array size)
    }

    public int get(int index) {
        // returns the item at location index of the lsit
    }

    public int set(int index, int i){
        // sets the item at location index to value i
        // returns the old value. 
    }

    public int remove(int index){
        // removes the item at index i
        // returns the old value
    }
}
/*
