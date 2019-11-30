package jogocarta;

import java.lang.reflect.Array;

public class Jogador {
	private String nome;
	private int vidas;
	private Deck[] decks = new Deck[10];
	int n = 0;
	


	public Jogador(String nome) {
		super();
		this.nome = nome;
		DeckDemo a = new DeckDemo("Primeirodeck");
		this.decks[0]= a;
	//vidas sera dado apenas n inicio da partida
	}
	
 
	//ges
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	public Deck getDecks(int i) {//sera utilizado qunado entrar em uma luta...
		
		return decks[i];
	}//adicionara um deck ao proximo ugar no array.
	
	public void listDecks() {
		for(int i = 0 ; i< (Array.getLength(decks)-1);i++) {
			try {
			System.out.println(this.decks[i].getNome());
			}
			catch(NullPointerException nexc) {
				
			}
			finally {
				
			}
		}
	}
	public void addDecks(Deck decks) {
		this.decks[n] = decks;
		n++;
	}






}
