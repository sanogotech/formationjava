package cnss.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
/**
 * 
 * @author IMAKO
 *
 */
@Entity 
public class Employo {  
	  
	@Id private long id; 
	@ManyToOne
	@JoinColumn(name="DEPT_ID")
	//@PrimaryKeyJoinColumn
	private Departement departement; 
	
	@ManyToMany
	 @JoinTable(name="EMP_PROJ",  joinColumns=@JoinColumn(name="EMP_ID"), inverseJoinColumns=@JoinColumn(name="PROJ_ID")) 
	private List<Projeto> projetos; 
	
}