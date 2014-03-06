import java.util.ArrayList;



public class BikeStore {
	
	private ArrayList<Bike> bikes = new ArrayList<Bike>();
	
	public String getAllBikes(){
		
		String bikeString = "";
		for(Bike b:bikes){
		bikeString = bikeString + "Cykel nummer "+bikes.indexOf(b)+" �r "+b.getColor()+", �r "+b.getSize()+" tum och kostar "+b.getPrice()+"kr.\n";
		}
		return bikeString;
	}
	
	public void startingBikes(){
		bikes.add(new Bike("r�d",5,2000));
		bikes.add(new Bike("bl�",25,25000));
		bikes.add(new Bike("bl�",8,0));
		bikes.add(new Bike("svart",20,100));
		bikes.add(new Bike("gul",28,30000));
		bikes.add(new Bike("gr�n",13,6500));
		bikes.add(new Bike("lila",11,8000));
		bikes.add(new Bike("r�n",18,700));
		bikes.add(new Bike("vit",9,300));
		bikes.add(new Bike("brun",22,45000));
	}
	
	public void addBike(String color, int size, int price){
		bikes.add(new Bike(color,size,price));
	}
	
	
	
}
