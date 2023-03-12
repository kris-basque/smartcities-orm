package br.com.fiap.smartcities.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.TipoEstabelecimento;

public class TipoEstabelecimentoTeste {

	public static void main(String[] args) {
		
		//inserir();
		consultar();

	}

	public static void consultar() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities-orm");
		EntityManager em = fabrica.createEntityManager();
		
		
		TipoEstabelecimento tipo = em.find( TipoEstabelecimento.class, 2 );
		
		System.out.print(tipo.getNome());
		
		em.close();
		fabrica.close();
		
		
	}
	
	
	
	public static void inserir() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities-orm");
		EntityManager em = fabrica.createEntityManager();
		TipoEstabelecimento tipo = new TipoEstabelecimento();
		tipo.setNome("Estabelecimento 2");
		tipo.setTipo("Tipo 2");
		
		em.getTransaction().begin();
		
		em.persist(tipo);
		
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
		
	}
	
	
}
