package webapp.timesheet.util;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import webapp.timesheet.persistence.Entreprise;
import webapp.timesheet.services.EntrepriseLocal;

@Singleton
@Startup
public class DBPopulator {

	@EJB
	private EntrepriseLocal EntrepriseLocal;
	
	public DBPopulator() {
	}
	
	@PostConstruct
	public void init(){
		Entreprise e1 = new Entreprise("FivePoints", "Academy");
		Entreprise e2 = new Entreprise("FivePoints", "Lab");
		Entreprise e3 = new Entreprise("FivePoints", "Carrier");
		EntrepriseLocal.create(e1);
		EntrepriseLocal.create(e2);
		EntrepriseLocal.create(e3);
	}
}
