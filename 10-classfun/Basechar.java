/* superclass for warrior (base class) and Mage */
public class Basechar {
    private int health=20;
    private String name;
    /*
    public Basechar (String s){
	setName(s);
	    }
    public BaseChar (){
	setName("Rabia");
    }
    */

    public String toString(){
	return this.getName();
    }
    
    public void attack(Basechar other){
	//System.out.println(this.getName()+" is attacking "+other.getName());
	System.out.println(this+" is attacking "+other);

    }
    
    public void setName(String name){
	this.name = name;
    }
    
    public String getName(){
	return this.name;
    }

    public int getHealth() {
	return this.health;
    }

    
}