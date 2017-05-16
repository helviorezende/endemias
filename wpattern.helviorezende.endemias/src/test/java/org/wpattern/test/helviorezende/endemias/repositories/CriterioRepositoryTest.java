package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.criterio.CriterioEntity;
import org.wpattern.helviorezende.endemias.criterio.CriterioRepository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class CriterioRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(CriterioRepositoryTest.class);
	
	@Autowired
	private CriterioRepository criterioRepository;
	
	@Test
	public void findAllTest(){
		List<CriterioEntity> criterio = this.criterioRepository.findAll();
		
		if(LOGGER.isInfoEnabled()){
			LOGGER.info("Test FindAll(): "+ criterio);
		}
	}
}
