package cnss.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import cnss.models.Employe;
import cnss.models.User;



public interface EmployeRepository extends JpaRepository<Employe, Long> {
	
	  /**
	   * Return the 'employe' having the passed 'nom' or null if no 'employe' is found.
	   * 
	   * @param nom
	   */
	  public List<Employe> findByNom(String nom);
	  /*
	  @Async
	    @Query("SELECT t.title FROM Todo t where t.id = :id") 
	    Future<String> findTitleById(@Param("id") Long id);
	  
	  @Query("SELECT t FROM Todo t where t.title = :title AND t.description = :description")
	    public Todo findByTitleAndDescription(@Param("title") String title, 
	                                                 @Param("description") String description);*/


	  


}
