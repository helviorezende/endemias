package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.exameviral.ExameViralEntity;
import org.wpattern.helviorezende.endemias.exameviral.ExameViralRepository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class ExameViralRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(ExameViralRepositoryTest.class);
	
	@Autowired
	private ExameViralRepository exameViralRepository;
	
	@Test
	public void findAllTest(){
		List<ExameViralEntity> exameviral = this.exameViralRepository.findAll();
		
		if(LOGGER.isInfoEnabled()){
			LOGGER.info("Test FindAll(): "+ exameviral);
		}
	}
	
}
