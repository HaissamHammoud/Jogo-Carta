package jogocarta;

public class DeckDemo extends Deck{
	public Carta cartas[];

	public DeckDemo(String nome) {
		super(nome);
		this.cartas = new Carta[40];
		Carta a = new Carta();
		
		for(int i = 0 ; i<40; i++){
			cartas[i]= a;
		}
		
	}

	public Carta[] getCartas() {
		return cartas;
	}

	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}
	
	
	
}
