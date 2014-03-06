
public class Main {

	private static Snake snake;
	private static Dogen dogen;
	
	public static void main(String[] args) {
		
		snake = new Snake("Giftus Ormus", true);
		dogen = new Dogen("Hundus Dogus", 6, true);
		
		System.out.println(snake.getInfo());
		System.out.println(dogen.getInfo());
		
		
		
		
		

	}

}
