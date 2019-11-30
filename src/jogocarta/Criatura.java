package jogocarta;

public class Criatura extends Carta {
	private int vidaTotal;
	private int vidaAtual;
	private int manaTotal;
	private int manaAtual;
	private int ataque;
	
	
	/////////////////////
	//getters e setesrs
	////////////////////
	
	public int getVidaTotal() {
		return vidaTotal;
	}
	public void setVidaTotal(int vidaTotal) {
		this.vidaTotal = vidaTotal;
	}
	public int getVidaAtual() {
		return vidaAtual;
	}
	public void setVidaAtual(int vidaAtual) {
		this.vidaAtual = vidaAtual;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getManaTotal() {
		return manaTotal;
	}
	public void setManaTotal(int manaTotal) {
		this.manaTotal = manaTotal;
	}
	public int getManaAtual() {
		return manaAtual;
	}
	public void setManaAtual(int manaAtual) {
		this.manaAtual = manaAtual;
	}
	
	
	
}
