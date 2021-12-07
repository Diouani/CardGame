
public class Monster extends Card {
	
	public static String type = "Monster";
	


	public int attack;
	public int hp;
	public Monster(int cost, String name, int attack, int hp) {
		super(cost, name);
		this.attack = attack;
		this.hp = hp;
	}
	public Monster() {
		
	}
	
	@Override
	public String toString() {
		return "Monster [attack=" + attack + ", hp=" + hp + ", Cost=" + Cost + ", Name=" + Name + "]";
	}

	
	
	


	



}
