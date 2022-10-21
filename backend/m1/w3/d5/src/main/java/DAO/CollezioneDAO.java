package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import models.Collezione;

public class CollezioneDAO {
	
	
	
	public static void addLibroRivista(Collezione e) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			EntityTransaction et = em.getTransaction();
			
			et.begin();
			em.persist(e);
			et.commit();
		} catch(Exception e) {
			em.close();
		}
		public static void deleteISBN(int codiceISBN) {
			EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
			try {
				Query q = em.createQuery(SELECT e from Collezione e WHERE e.)
				Collezione c = em.find(null, c)
			}
			
		}
	}
}
