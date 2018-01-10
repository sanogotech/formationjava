package com.cnss.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cnss.demo.domain.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {

		@Modifying
	    @Query("UPDATE Livre lv SET lv.titre = :titre WHERE lv.id = :livreId")
	    Long updateLivre(@Param("livreId") Long livreId, @Param("titre") String titre);
}
