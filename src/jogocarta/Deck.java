package jogocarta;

public class Deck {

	private Carta cartas[];
	private String nome;
	
	public Deck(String nome) {
		super();
		setNome(nome);
	}



	public Carta[] getCartas() {
		return cartas;
	}


	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
