import java.util.ArrayList;


public class Program {
	private String name;
	private String code;
	private int women;
	private int men;
	private ArrayList<Program> programsList = new ArrayList<Program>();

	
	public Program(String name, String code, int women, int men){
		this.name = name;
		this.code = code;
		this.women = women;
		this.men = men;
	}
	
	public String getName(){
		return name;
	}
	
	public String getCode(){
		return code;
	}
	
	public int getWomen(){
		return women;
	}
	
	public int getMen(){
		return men;
	}
	
	
}
