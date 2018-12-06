package webapp.timesheet.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.ManyToOne;


public class TimeSheet implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date dateDebut;
	private Date dateFin;
	@ManyToOne
	private Employe emp;
	@ManyToOne
	private Mission mission; 

	public TimeSheet() {
		super();
	}

	public TimeSheet(Date dateDebut, Date dateFin) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Employe getEmp() {
		return emp;
	}

	public void setEmp(Employe emp) {
		this.emp = emp;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

}
