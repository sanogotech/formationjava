package democnssSimpleV4;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cnss.demo.repository.LivreRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LivreRepositoryTest  {

	@Autowired
	LivreRepository livreRepository;
	
	@Test
	public void testUpdateLivre() {
		
		livreRepository.updateLivre(122L, "CORAN");	
	}

}