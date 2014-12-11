public abstract class Earth extends Basechar implements Comparable{
    public Earth(){
	super();
	setElement("earth");
	setA1name("boulder throw");
	setA2name("rock block");
	setA3name("solidify");
	setA4name("earthquake");
    }
    public int CompareTo(Earth other){
	return (this.getName()).compareTo(other.getName());
    }
}
