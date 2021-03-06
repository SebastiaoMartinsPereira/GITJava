package br.com.newprog.tarefas;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tarefa {

	@Id
	@GeneratedValue
	private  Long id;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataFinalizacao;
	private String descricao;
	private  Boolean isFinalizado;

	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getIsFinalizado() {
		return isFinalizado;
	}
	public void setIsFinalizado(Boolean isFinalizado) {
		this.isFinalizado = isFinalizado;
	}
}
