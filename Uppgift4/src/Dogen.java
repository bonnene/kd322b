
public class Dogen extends Mammal{
	
	private boolean stupid;
	
	public Dogen(String latinName, int milkTime, boolean stupid){
		super(latinName, milkTime);
		this.stupid = stupid;
	}
	
	public boolean getStupid(){
		return stupid;
	}

	String getInfo() {
	  String s;
		if(this.getStupid()==true){
			s = "The dog \""+this.getLatinName()+"\" nurses for "+this.getMilkTime()+" months and is stoopid.\n";
		}else{
			s = "The dog \""+this.getLatinName()+"\" nurses for "+this.getMilkTime()+" months and isn't stupid.\n";
		}
	  return s;
	}

}
