import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class Game {
	
	
	int playerOnePoints ;
	int playerTwoPoints ;
	
	/*
			enum spellName{BlackHole,Durendal,Amplifier,RatTrap,ElephantKiller,Excalibur};
			enum monsterName{Ratata,Dracofeu,Ponyta,Dragoloss,Salameche,popeye};
			enum fieldName{Yami,Vahlala,Howlingabyss,Amakna,Sufokia,Olympe};
	*/
	
	
	String[] spellName = {"BlackHole","Durendal","Amplifier","RatTrap","ElephantKiller","Excalibur"};
	String[] monsterName = {"Ratata","Dracofeu","Ponyta","Dragoloss","Salameche","popeye"};
	String[] fieldName = { "Yami","Vahlala","Howlingabyss","Amakna","Sufokia","Olympe"};
	
	
			
	
	public Game() throws InterruptedException {
		
		
	
		//spellName.values().length
	
		

		
		//Generation du Deck
		
		ArrayList<Card>  DeckP1 =  new ArrayList();
		ArrayList<Card>  DeckP2 =  new ArrayList();
		 
		ArrayList<Card> DeckArray = new ArrayList<Card>();
		
		for(String mySpell : spellName ) {
            DeckP1.add(new Spell((int)(1 + (Math.random() * (9 - 1))),mySpell,"This card destroy all the monsters in the field")) ;
            DeckP2.add(new Spell((int)(1 + (Math.random() * (9 - 1))),mySpell,"This card destroy all the monsters in the field")) ;
			
		}
		
		for(String myMonster : monsterName ) {
			DeckP1.add(new Monster((int)(1 + (Math.random() * (9 - 1))),myMonster,(int)(10 + (Math.random() * (100 - 10))),(int)(10 + (Math.random() * (100 - 10)))));
			DeckP2.add(new Monster((int)(1 + (Math.random() * (9 - 1))),myMonster,(int)(10 + (Math.random() * (100 - 10))),(int)(10 + (Math.random() * (100 - 10)))));
			
		}
		
		for(String myField : fieldName) {
			DeckP1.add( new Field(0,myField , "test test"));	
			DeckP2.add( new Field(0,myField , "test test"));
		}
		
	
	 ArrayList<Card> Player1 = DeckP1;
	 Collections.shuffle(DeckP1);
	 
	 ArrayList<Card> Player2 = DeckP2;
	 Collections.shuffle(DeckP2);
	 System.out.println("Lets start the game !");
for(int i = 0; i < DeckP1.size() ; i++) {
	Card cardP1 = Player1.get(i);
	Card cardP2 = Player2.get(i);
	
	TimeUnit.SECONDS.sleep(2);
	System.out.println("Player 1 : "+cardP1 );
	TimeUnit.SECONDS.sleep(2);
	System.out.println("Versus");
	TimeUnit.SECONDS.sleep(2);
	System.out.println("Player 2 : "+cardP2 );
	TimeUnit.SECONDS.sleep(2);
	if(cardP1 instanceof Spell && cardP2 instanceof Spell ){
		
		if(cardP2 instanceof Spell && cardP1.Cost > cardP2.Cost) {
			System.out.println("P1 Win !1");
			playerOnePoints++;
		}else if(cardP2 instanceof Spell && cardP1.Cost == cardP2.Cost) {
			System.out.println("Draw2");
		}
		else if (cardP2 instanceof Spell && cardP1.Cost < cardP2.Cost)  {
			System.out.println("P2 Win!3");
			playerTwoPoints++;
		}
		
	}
	
	else if(cardP1 instanceof Spell || cardP2 instanceof Spell) {
			 if(!(cardP2 instanceof Spell) ) {
				System.out.println("P1 Win!4" );
				playerOnePoints++;
			}else if (!(cardP1 instanceof Spell)) {
				System.out.println("P2 Win!5" );
				playerTwoPoints++;
			}

	}
	else if(cardP1 instanceof Monster ||cardP2 instanceof Monster ) {
		if(cardP1 instanceof Monster && cardP2 instanceof Monster) {
			if(cardP2 instanceof Monster && ((Monster)cardP1).attack >  ((Monster) cardP2).attack ) {
				
				System.out.println("P1 Win !6");
				playerOnePoints++;
			}else if(cardP2 instanceof Monster && cardP1.Cost == cardP2.Cost) {
				System.out.println("Draw7");
			}
			else  {
				System.out.println("P2 Win !8");
				playerTwoPoints++;
			}
	
		}
	
		if(!(cardP2 instanceof Monster)    ) {
			System.out.println("P1 Win !9" );
			playerOnePoints++;
		}else if (!(cardP1 instanceof Monster)) {
			System.out.println("P2 Win !10" );
			playerTwoPoints++;
		}
		
	}else if(cardP1  instanceof Field && cardP2 instanceof Field ) {
			System.out.println("Draw11");
		}
		
	
	
	
	System.out.println("---------------------------------------------------------------");
	System.out.println("Player One Points = " + playerOnePoints);
	
	System.out.println("Player Two Points = " + playerTwoPoints);
	System.out.println("---------------------------------------------------------------");
	
	

	
	
	
	
}

if(playerOnePoints > playerTwoPoints ) {
	System.out.println("Player 1 Wins The Match ! ");
}else if (playerOnePoints < playerTwoPoints) {
	System.out.println("Player 2 Wins The Match ! ");
}else {
	System.out.println("It's a draw !");
}

	 

	/*	
		for (Card Cartes1: Player1) {
			System.out.println(Cartes1);
			}
			
			System.out.println("--------------------------------------------------");
			
			
			for (Card Cartes2: Player2) {
				System.out.println(Cartes2);
				
		    
		}
			
		*/	
		
	   
			
			
			
			
	  
			
			
			
		
		
	
		
		
		
	
	
	
	}
}
	
	
	
	
	


