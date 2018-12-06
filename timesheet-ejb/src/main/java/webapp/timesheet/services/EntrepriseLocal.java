package webapp.timesheet.services;

import java.util.List;

import javax.ejb.Local;

import webapp.timesheet.persistence.Entreprise;

@Local
public interface EntrepriseLocal {
	
	void create(Entreprise entreprise);
	List<Entreprise> findAll();

}
