
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Baralho {

	private List<Carta> cartasFora = new ArrayList<Carta>();
	private List<Carta> cartasNoBaralho = new ArrayList<Carta>();
	int NUMBER_OF_CARDS;
	Random ram = new Random();
	
	public Baralho(){
		montarBaralho();
	}
	
	Random random = new Random();
	
	public void montarBaralho(){
		
		 tipoFace[] faces = {tipoFace.DOIS,tipoFace.TRES,tipoFace.QUATRO,tipoFace.CINCO,tipoFace.SEIS,tipoFace.SETE
				 ,tipoFace.OITO,tipoFace.NOVE,tipoFace.DEZ,tipoFace.AS,tipoFace.VALETE,tipoFace.DAMA,tipoFace.REIS};
		 
		 tipoNaipe[] naipes = {tipoNaipe.COPAS,tipoNaipe.ESPADAS,tipoNaipe.OURO,tipoNaipe.PAUS};
		 
	
			for (int i = 0; i < naipes.length; i++) {
				for (int j = 0; j < faces.length; j++) {
					this.cartasNoBaralho.add(new Carta(naipes[i], faces[j]));
				}
			}
			
			this.NUMBER_OF_CARDS = faces.length * naipes.length;
		
	}
	
	
	public Carta pegarCarta(){
		
		int tam = this.cartasNoBaralho.size();
		int cardIndex1 = ram.nextInt(tam);
		
		Carta carta = getCartasNoBaralho().get(cardIndex1);
		this.cartasNoBaralho.remove(carta);
		setCartasFora(carta);
		return carta;
	}
	
	
	@SuppressWarnings("unchecked")
	public void shuffle(){
			
          cartasNoBaralho.sort((Comparator<? super Carta>) getCartasNoBaralho().get(1));
	}
	
	
	public List<Carta> getCartasFora() {
		return cartasFora;
	}

	public void setCartasFora(Carta carta) {
		this.cartasFora.add((Carta) carta);
	}

	public List<Carta> getCartasNoBaralho() {
		return cartasNoBaralho;
	}

	public void setCartasNoBaralho(List<Carta> cartasNoBaralho) {
		this.cartasFora.add((Carta) cartasNoBaralho);
	}


}

