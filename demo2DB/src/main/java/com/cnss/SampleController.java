package com.cnss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnss.pension.domain.Assure;
import com.cnss.pension.repo.AssureRepository;
import com.cnss.region.domain.AssureRegion;
import com.cnss.region.repo.AssureRegionRepository;

@RestController
public class SampleController {

  @Autowired
  public  AssureRepository  assureRepository;
  @Autowired
  public AssureRegionRepository  assureRegionRepository;


  @RequestMapping("/assure/{id}")
  public String fooBar(@PathVariable("id") Long id) {
    Assure assure =  assureRepository.findOne(id);
    AssureRegion assureRegion  = assureRegionRepository.findOne(id);

    return "Assure Nom =" + assure.getNom() + "  AssureRegion Nom =" + assureRegion.getNom() + "!";
  }

}
