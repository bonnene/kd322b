
public class Bike extends BikeStore{
	private String color;
	private int price;
	private int size;
	private static int nbrOfBikes; //Counts nbr of instances
	
	/**Creates a Bike with instance-variables limited by values in Constants.java**/
	public Bike(String color, int size){
		nbrOfBikes = nbrOfBikes+1;
		this.color = color;
		this.size = size;
	}
	
	/**Creates a Bike with instance-variables limited by values in Constants.java**/
	public Bike(String color, int size, int price){
		nbrOfBikes = nbrOfBikes+1;

		if(size <= Constants.MAX_SIZE && size >= Constants.MIN_SIZE){
			this.size = size;
		}else{
			if(size > Constants.MAX_SIZE){
				this.size = Constants.MAX_SIZE;
			}else{
				if(size < Constants.MIN_SIZE){
					this.size = Constants.MIN_SIZE;
				}
			}
		}		

		for(int i=0;i<Constants.acceptedColors.length;i++){
			if(color.equals(Constants.acceptedColors[i]) == false){
				this.color = "okänd färg";
			}
		}
		for(int i=0;i<Constants.acceptedColors.length;i++){
			if(color.equals(Constants.acceptedColors[i])){
				this.color = color;
			}
		}		

		if(price <= Constants.MAX_PRICE && size >= Constants.MIN_PRICE){
			this.price = price;
		}else{
			if(price > Constants.MAX_PRICE){
				this.price = Constants.MAX_PRICE;
			}else{
				if(price < Constants.MIN_PRICE){
					this.price = Constants.MIN_PRICE;
				}
			}
		}	


	}
	
	/**Returns the color of the bike**/
	public String getColor(){
		return color;
	}
	
	/**Returns the size of the bike**/
	public int getSize(){
		return size;
	}
	
	/**Returns the price of the bike**/
	public int getPrice(){
		return price;
	}

	/**Sets a new price for the bike**/
	public int setPrice(int price){
		price = this.price;
		return price;
	}
	
	/**Returns the total number of bikes**/
	public static int getNbrOfBikes(){
		return nbrOfBikes;
	}



}



