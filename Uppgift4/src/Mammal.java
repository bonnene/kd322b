
public abstract class Mammal extends Animal{
	
	private int milkTime;
	
	public Mammal(String latinName, int milkTime){
		super(latinName);
		this.milkTime = milkTime;
	}
	
	public int getMilkTime(){
		return milkTime;
	}

}
