/**
 * 
 */
package controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Pet;

/**
 * @author Ruth Ann
 *
 */
public class PetHelper {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("petadoption");
		
		public void persist(Pet p) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(p);
		manager.getTransaction().commit();
		manager.close();
		}

		public Pet searchPetByName(String oldName) {
			EntityManager manager = factory.createEntityManager();
			TypedQuery<Pet> qurey = manager.createQuery("SELECT i FROM petadoption i WHERE i.petType = :petType", Pet.class);
			query.setParameter("petType",oldName);
			Pet dbEntity = (Pet) query.getSingleResult();;
			return dbEntity;
		}
		public void delete(Pet p) {
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			manager.remove(manager.find(Pet.class, p.getRowId()));
			manager.getTransaction().commit();
			manager.close();
			}

		public List<Pet> show() {
			EntityManager manager = factory.createEntityManager();
			List<Pet> allItems = manager.createQuery("SELECT i FROM pets i").getResultList();
			return allItems;
		}
		
	}
