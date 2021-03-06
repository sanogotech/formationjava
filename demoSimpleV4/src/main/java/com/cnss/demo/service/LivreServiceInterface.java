package com.cnss.demo.service;

import java.util.List;

import com.cnss.demo.domain.Genre;
import com.cnss.demo.domain.Livre;

public interface LivreServiceInterface {
	
	public Livre saveLivre(Livre livre);
	public Boolean deleteLivre(Long livreId);
	public Livre editLivre(Livre livre);
	public Livre findLivre(Long livreId);
	public List<Livre> getAllLivres();
	public List<Genre> getAllGenres();

}
