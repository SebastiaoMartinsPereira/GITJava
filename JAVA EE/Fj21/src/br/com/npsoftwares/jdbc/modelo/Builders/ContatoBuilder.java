package br.com.npsoftwares.jdbc.modelo.Builders;

import java.util.Calendar;

import br.com.npsoftwares.jdbc.modelo.Contato;

public class ContatoBuilder {

	private String Nome;
	private String Email;
	private String Endereco;
	private Calendar DataCadastro;

	public ContatoBuilder ComNome(String nome)
	{
		this.Nome = nome;
		return this;
	}
	
	public ContatoBuilder ComEmail(String email)
	{
		this.Email = email;
		return this;
    }
	
	public ContatoBuilder ComEndereco(String endereco)
	{
		this.Endereco = endereco;
		return this;
	}
	
	public ContatoBuilder NaData(Calendar dataCadastro)
	{
		this.DataCadastro = dataCadastro;
		return this;
	}
	
	public Contato Criar()
	{
		return new Contato(getNome(),getEmail(),getEndereco(),getDataCadastro());
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public Calendar getDataCadastro() {
		return DataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		DataCadastro = dataCadastro;
	}
}
