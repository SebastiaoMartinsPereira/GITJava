
public class Cliente extends Jogador{
	
	public Cliente() {
		super();
	}

	public void joga(Carta carta){
		
		this.setCartas(carta);
		this.somaPontos(carta.getFace().getValor());
		System.out.println("Carta Retirada : \n"+carta.getFace().name() + " " + carta.getNaipe().name()  + " = " +  carta.getFace().getValor());
	    System.out.println("Sua pontuação :" + this.mostraPontos()+"\n");
	    
	}
}
