
public class Snake extends Animal{
	
	private boolean poisonous;
	
	public Snake(String latinName, boolean poisonous){
		super(latinName);		
		this.poisonous = poisonous;
	}
	
	public boolean getIsPoisonous(){
		return poisonous;
	}

	public String getInfo() {
		String s = "";
		if(this.poisonous == true){
			s= "The snake \""+this.getLatinName()+"\" is poisonous.\n";
		}else{
			s= "The snake \""+this.getLatinName()+"\" is not poisonous.\n";
		}		
		return s;
	}

}
