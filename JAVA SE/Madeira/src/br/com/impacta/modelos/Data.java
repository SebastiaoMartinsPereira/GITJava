package br.com.impacta.modelos;

public class Data {

	
	private int dia;
	private int mes;
	private int ano;
	private String data;
	
	
	public Data(){
		
	}

	public Data(int dia, int mes, int ano){
		
		setData(ano,mes,dia);
	}
	
	@Override
	public String toString() {
		return String.format("%d/%d/%d",getDia(),getMes(),getAno());
	}


	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		
		if(getMes()==2)
		{
			if(dia>0 && dia <=29)
			{
				this.dia = dia;
			}else
			{
				this.dia=1;
			}
			
		}else{
			
			if(dia>0 && dia <=31)
			{
				this.dia = dia;
			}else
			{
				this.dia=1;
			}
		}
		
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		
		
		if(mes >0 && mes <=12)
		{
			this.mes = mes;
		}else
		{
			this.mes=1;
		}

	}
	
	
	public int getAno() {
		
		return ano;
	}
	
	public void setAno(int ano) {
		
		if(ano >1900 && ano <=3000)
		{
			this.ano = ano;
		}else
		{
			this.ano=1900;
		}
	}
	
	
	public String getData() {
		return data;
	}

	public void setData(int ano,int mes,int dia) {
		
		setAno(ano);
		setMes(mes);
		setDia(dia);
		
		this.data = String.format("%s/%s/%s", getDia(),getMes(),getAno());
	}
	
	

}
