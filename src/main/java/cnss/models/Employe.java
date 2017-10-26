package cnss.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
/**
 *  @JoinTable(name="EMP_PROJ",          joinColumns=@JoinColumn(name="EMP_ID"),          inverseJoinColumns=@JoinColumn(name="PROJ_ID")) 
 * @author IMAKO
 *
 */
@Entity 
public class Employe  implements Serializable {  
	  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; 
	@ManyToOne
	@JoinColumn(name="DEPT_ID")
	private Departement departement; 
	
	private String transport;
	
	

	@ManyToMany
	private List<Projet> projets; 
	
	@NotNull
	@Size(min=2, max=30, message="Taille de 2 à 30")
	private String nom;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}



	private String prenom;
	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	
	
}