
public class Field extends Card {
	
	public static String type = "Field";
	
	public String element;

	public Field(int cost, String name, String element) {
		super(cost, name);
		this.element = element;
	}

	@Override
	public String toString() {
		return "Field [element=" + element + ", Cost=" + Cost + ", Name=" + Name 
				+ "]";
	}


	



	

	
	

}
