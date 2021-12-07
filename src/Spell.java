
public class Spell extends Card {
	
	public static String type = "Spell";

	private String description;

	
	
	public Spell() {
		
	}



	public Spell(int cost, String name, String description) {
		super(cost, name);
		this.description = description;
	}



	@Override
	public String toString() {
		return "Spell [" +" Name = " +  Name +   ", Cost=" + Cost + "]";
	}

	


	



	
	

}
