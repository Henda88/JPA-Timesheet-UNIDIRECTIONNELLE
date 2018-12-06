package webapp.timesheet.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import webapp.timesheet.entities.Departement;

@Entity
@Table(name="entreprise")
public class Entreprise implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id    
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer id;
	private String name;
	private String raisonSocial; 
	@OneToMany
    private List<Departement> dep = new ArrayList<>(); 
	
	
	public Entreprise() {
	}   
	
	public Entreprise(String name, String raisonSocial) {
		this.name = name;
		this.raisonSocial = raisonSocial; 
	}
	
	public List<Departement> getDep() {
		return dep;
	}

	public void setDep(List<Departement> dep) {
		this.dep = dep;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getRaisonSocial() {
		return this.raisonSocial;
	}
	
	public void setRaisonSocial(String raisonSocial) {
		
		this.raisonSocial = raisonSocial; 
	}

	
   
}
