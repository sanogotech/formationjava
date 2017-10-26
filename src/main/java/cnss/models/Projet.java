package cnss.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity 
public class Projet {
	@Id private long id; 
	
	@ManyToMany(mappedBy="projets")
	private List<Employe> employes; 
}
