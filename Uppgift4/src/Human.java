
public class Human{
	
	private Dog dog;
	private String name;
	
	public Human(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void buyDog(Dog dog) {
		this.dog = dog;
	}
	
	public String getInfo(){
		String info = "";
		if(this.dog != null){
		info = this.getName()+" har en hund som heter "+this.dog.getName()+".";
		}else{
		info = this.getName()+" har inte en hund.";
		}
		return info;
	
	}

	
	
}
