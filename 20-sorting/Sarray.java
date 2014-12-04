public class Sarray {
    private String[] data;
    private int last;
    public Sarray() {
	data =  new String [] {"z","f","e"};
	last = data.length;
        // set up the initial instance variables
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < data.length; i++) {
	    s = s + data[i]+", ";
	}
	return s;
    }
    public void isort(){
	// Given int array a with last item at index "last"
	// newvalue is the new value to insert
	int i;
	String newvalue;
	for (int z =0; z<last; z++) {
	    newvalue = data[z];	    
	    for (i = z; i > 0 && newvalue.compareTo(data[i-1])<0 ; i--) {
		data[i] = data[i-1];    
	    }
	    data[i]=newvalue;
	}
    }
    /*
    public boolean add(int n){
        // adds an item to the end of the list, grow if needed
        // returns true
	int[] newdata;
	if(last != (data.length - 1)){
	    newdata = new int[data.length];
	    newdata[last+1] = n;
	}
	else{
	    newdata = new int[data.length + 1];
	    for(int j = 0 ; j < (newdata.length - 1) ; j++){
		newdata[j] = data[j];
	    }
	    newdata[last+1] = n;
	}
	data = newdata;
	last++;
	return true;	    
    }
    */
    public void  add(int index, String n){
	// adds item i at index, shifting everything down as needed.
	// also grows as needed 
	if (index<=data.length+1){
	    String []newdata=new String[data.length+1];
	    int num =0;
	    for (int i=0;i<newdata.length;i++){
		if (i==index){
		    newdata[i]=n;
		}
		else{
		    if (num<data.length){
			newdata[i]=data[num];
		       
		    }
		    num++;
		}
	    }
	    data=newdata;
	}
	else{
	    String[]newdata=new String[index+1];
	    for (int i=0;i<data.length;i++){
		newdata[i]=data[i];
	    }
	    newdata[index]=n;
	    data=newdata;
	}
	last=index;
    }
  

    public int size() {
	// returns the number of items in the list (not the array size)
	int size=last +1;
	return size;
    }
    public String get(int index) {
	// returns the item at location index of the list
	return data[index];
	/* I'm not sure if this means to exclude the 0's*/
    }
    public String[] getData(){
	return data;
    }
    public String set(int index, String i){
	// sets the item at location index to value i
	// returns the old value. 
	String old=data[index];
	data[index]=i;
	return old;
    }


    public String remove(int index){
	// removes the item at index i
	// returns the old value
	String old=data[index];
	data[index]="";
	return old;

    }



}


