package cnss.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity 
public class Projeto {
	@Id private long id; 
	
	@ManyToMany(mappedBy="projetos")
	private List<Employo> employos; 
}
