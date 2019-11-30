package jogocarta;

public class JogoCarta {

	public static void main(String[] args) {

		DeckDemo lodec = new DeckDemo("umdeck");
		DeckDemo lodec2 = new DeckDemo("umdeck");
		DeckDemo lodec3 = new DeckDemo("umdeck");
		System.out.println("oi");
		Jogador valdomiro = new Jogador("ash");
		
		valdomiro.addDecks(lodec);
		valdomiro.addDecks(lodec2);
		valdomiro.addDecks(lodec3);
		valdomiro.listDecks();
		
		
	}

}
