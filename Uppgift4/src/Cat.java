
public class Cat extends Mammal{
	
	private int lives;
	
	public Cat(String latinName, int milkTime, int lives){
		super(latinName, milkTime);
		this.lives = lives;
	}
	
	public int getNbrOfLives(){
		return lives;
	}

	String getInfo() {
		String s;
		if(this.getNbrOfLives()==1){
			s = "The cat \""+this.getLatinName()+"\" nurses for "+this.getMilkTime()+" months and has "+this.getNbrOfLives()+" life.\n";
		}else{
		    s = "The cat \""+this.getLatinName()+"\" nurses for "+this.getMilkTime()+" months and has "+this.getNbrOfLives()+" lives.\n";
		}
		return s;
	}

}
