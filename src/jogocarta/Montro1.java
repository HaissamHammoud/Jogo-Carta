package jogocarta;
//monstro podera atacar outra criaturaou usar magia 
//devera ser criada a interface para carta 
//na verdade seria legal fazer uma classe para criaturas antes

public class Montro1 extends Criatura {
	
	
	public Montro1() {
		this.setVidaTotal(5);
		this.setVidaAtual(this.getVidaTotal());
		this.setAtaque(2);	
		this.setManaTotal(5);
		this.setManaAtual(this.getManaTotal());


	}
	
	// metodos
	//tira 3 de vida do oponente
	public void furiaMonstrengo(Criatura x){
		if (getManaAtual()>2){
			x.setVidaAtual(x.getVidaAtual() - 3);
			this.setManaAtual(getManaAtual() - 3);
			System.out.println("grrrr");
		}
		else{
			System.out.println("Mana insuficiente");
		}
	}
	//metodo que indica as ações possiveis
	public void acoes() {
		
		
	}




	
}
