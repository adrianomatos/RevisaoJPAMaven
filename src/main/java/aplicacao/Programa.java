package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		// USADO P/ CADASTRO
		//Pessoa p1 = new Pessoa(null, "Adriano", "dry@gmail.com");
		//Pessoa p2 = new Pessoa(null, "Rebeca", "rebs@hotmail.com");
		//Pessoa p3 = new Pessoa(null, "Juninho", "jr@gmail.com");
																		//Nome no persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		// USADO P/ CADASTRO
		//em.getTransaction().begin();
		//em.persist(p1);
		//em.persist(p2);
		//em.persist(p3);
		//em.getTransaction().commit();
		
		// BUSCA POR ID
		//Pessoa p = em.find(Pessoa.class, 2);
		//System.out.println(p);
			
		// REMOÇÃO POR ID
		//Pessoa p =  em.find(Pessoa.class, 2);
		//em.getTransaction().begin();
		//em.remove(p);
		//em.getTransaction().commit();
		
		System.out.println("Finalizado!");
		em.close();
		emf.close();
	}

}
