package br.com.newprog.tarefas.jpa;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.newprog.tarefas.Tarefa;

public class AddTarefa {

	public static void main(String[] args) {
		
		br.com.newprog.tarefas.Tarefa tarefa = new Tarefa();
		tarefa.setDescricao("Estudar JPA e Hibernate");
		tarefa.setIsFinalizado(true);
		tarefa.setDataFinalizacao(Calendar.getInstance());
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(tarefa);
		manager.getTransaction().commit();
		
		System.out.println("Id da tarefa: " + tarefa.getId());
		manager.close();
	}
	
}
