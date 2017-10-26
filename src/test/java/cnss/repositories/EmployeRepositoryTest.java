package cnss.repositories;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cnss.models.Employe;




@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeRepositoryTest {
	
	
	@Autowired
	private EmployeRepository employeRepository;
	
	@Test
	public void testCount(){
		
		Long number = employeRepository.count();
		assertEquals(0L, number.longValue());
		
		
		
	}
	
	
	@Test
	public void testSave(){
		
		Employe employe = new Employe();
		
		employe.setNom("HARIRA");
		employe.setPrenom("Adamou");
		
		Employe employeresult = employeRepository.save(employe);
		
		assertEquals("HARIRA",employeresult.getNom());
		
	
	}
	
	@Test
	public void testFindByName(){
	
		List<Employe> employeresult = employeRepository.findByNom("HARIRA");
		
		assertEquals("HARIRA",employeresult.get(0).getNom());
		
	
	}


}
