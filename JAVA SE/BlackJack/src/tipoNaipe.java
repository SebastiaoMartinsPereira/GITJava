
public enum tipoNaipe {
	
	ESPADAS("Espadas"),
	COPAS("Copas"),
	PAUS("Paus"),
	OURO("Ouro");
	
	
	private tipoNaipe(String descricao){
		this.descricao=descricao;
	}
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

			
}
