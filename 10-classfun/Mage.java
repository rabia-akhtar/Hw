public class Mage extends Basechar{
    private int manna =12345;
    public Basechar (String s){
	setName(s);
	    }
    public BaseChar (){
	setName("Rabia");
    }
    public int setManna(int n){
	manna = n;
    }
    public int getManna(){
	return manna;
    }
    
}