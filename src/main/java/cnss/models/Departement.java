package cnss.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Departement {    
	@Id 
	private long id;  
	
	private String name;
	
	
	@OneToMany(mappedBy="departement")
	private List<Employe> employes;     

}
