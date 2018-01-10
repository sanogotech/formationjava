package com.cnss.demo.service;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cnss.demo.domain.Genre;
import com.cnss.demo.repository.GenreRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssureInfoServiceTest {
	
	@Autowired
	AssureInfoService assureInfoService;
	
	@Autowired
	GenreRepository genreRepository;

/*	@Test
	public void testgetAgeDepartRetraite() {
		//Init input
		int anneeNaissance = 1959;
		String genre = "M";
		
		//Call Service
		int anneDepartRetraite = assureInfoService.getAgeDepartRetraite(anneeNaissance,genre);
		
		//Assertion
		//assertEquals(expected, actual);
		assertEquals(2019, anneDepartRetraite);
		assertNotEquals(2002, anneDepartRetraite);
		
	}*/
	
	@Test
	public void testGenre() {
		List<Genre> listGenre =genreRepository.findByLivreTitre("toto");
		assertNotNull(listGenre);
		assertEquals("THE", listGenre.get(0).getCode());
	}

}
