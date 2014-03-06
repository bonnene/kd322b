
public abstract class Animal {
	
	private String latinName;
	
	public Animal(String latinName){
		this.latinName = latinName;
	}
	
	public String getLatinName(){
		return latinName;
	}
	
	abstract String getInfo();


}
