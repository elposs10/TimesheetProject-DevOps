package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
@Entity
public class Employe implements Serializable {

	private static final long serialVersionUID = -1396669830860400871L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String prenom;

	private String nom;

	// @Column(unique=true)
	private String email;

	private boolean isActif;

	@Enumerated(EnumType.STRING)
	// @NotNull
	private Role role;

	// @JsonBackReference
	@JsonIgnore
	@ManyToMany(mappedBy = "employes", fetch = FetchType.EAGER)
	// @NotNull
	private List<Departement> departements;

	@JsonIgnore
	// @JsonBackReference
	@OneToOne(mappedBy = "employe")
	private Contrat contrat;

	@JsonIgnore
	// @JsonBackReference
	@OneToMany(mappedBy = "employe")
	private List<Timesheet> timesheets;

	public Employe() {
		super();
	}

	public Employe(String nom, String prenom, String email, boolean isActif, Role role) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.isActif = isActif;
		this.role = role;
	}

	@Generated
	public int getId() {
		return id;
	}

	@Generated
	public void setId(int id) {
		this.id = id;
	}

	@Generated
	public String getPrenom() {
		return prenom;
	}

	@Generated
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Generated
	public String getNom() {
		return nom;
	}

	@Generated
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Generated
	public String getEmail() {
		return email;
	}

	@Generated
	public void setEmail(String email) {
		this.email = email;
	}

	@Generated
	public boolean isActif() {
		return isActif;
	}

	@Generated
	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}

	@Generated
	public Role getRole() {
		return role;
	}

	@Generated
	public void setRole(Role role) {
		this.role = role;
	}

	@Generated
	public List<Departement> getDepartements() {
		return departements;
	}

	@Generated
	public void setDepartements(List<Departement> departement) {
		this.departements = departement;
	}

	@Generated
	public Contrat getContrat() {
		return contrat;
	}

	@Generated
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	@Generated
	public List<Timesheet> getTimesheets() {
		return timesheets;
	}

	@Generated
	public void setTimesheets(List<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}

}
