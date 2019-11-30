package jogocarta;
//pode-se criar o tipo criatura ou magia , sendo criatura uma carta que pode ficar no campo de batalha, a magia apenas usada
//e alguma criatura ou no campo inteiro , ou quel seja o efeito que a carta tera.

public class Carta {

	private String nome;
	public Carta() {
		System.out.println("Criado");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	
	
	
}
