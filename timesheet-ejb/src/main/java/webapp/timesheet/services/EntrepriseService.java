package webapp.timesheet.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import webapp.timesheet.persistence.Entreprise;

@Stateless
public class EntrepriseService implements EntrepriseRemote, EntrepriseLocal {
	
	@PersistenceContext
	private EntityManager em;

    public EntrepriseService() {
    }

	public void create(Entreprise entreprise) {
		em.persist(entreprise);
	}

	public List<Entreprise> findAll() {
		return em.createQuery("from Entreprise", Entreprise.class).getResultList();
	}

}
