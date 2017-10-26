package cnss.repositories;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.assertj.core.api.AssertDelegateTarget;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cnss.services.MoneyService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoneyServiceImplTest {

	@Autowired
	MoneyService moneyService;
	
	@Test
	public void testConversion() {
	  long resultat =moneyService.convertirCFAEURO(10000L);
	  System.out.println("résultat :"+ resultat);
	  assertEquals(15L, resultat);
	  assertNotEquals(16L, resultat);

	}

}
