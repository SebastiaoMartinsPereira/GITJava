
public enum tipoFace {

	DOIS("Dois",2),
	TRES("Três",3),
	QUATRO("Quatro",4),
	CINCO("Cinco",5),
	SEIS("Seis",6),
	SETE("Sete",7),
	OITO("Oito",8),
	NOVE("Nove",9),
	DEZ("Dez",10),
	AS("Ás",1),
	VALETE("Valete",10),
	REIS("Reis",10),
	DAMA("Dama",10);
	
	private tipoFace(String descricao,int valor){
		this.descricao=descricao;
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getValor() {
		return valor;
	}
	
	private String descricao;
	private int valor;

}
