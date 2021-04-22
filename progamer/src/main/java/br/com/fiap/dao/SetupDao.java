package br.com.fiap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.model.Setup;

public class SetupDao {

	public void save(Setup setup) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
		EntityManager entityMana = factory.createEntityManager();
		
		try {
			entityMana.getTransaction().begin();
			entityMana.persist(setup);
			entityMana.getTransaction().commit();
			} catch (Exception e) {
				entityMana.getTransaction().rollback();
				e.printStackTrace();
			}
		
		entityMana.close();
	}

}
