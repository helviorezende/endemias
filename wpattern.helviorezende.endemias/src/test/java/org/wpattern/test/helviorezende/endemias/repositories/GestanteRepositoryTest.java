package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.gestante.GestanteEntity;
import org.wpattern.helviorezende.endemias.gestante.GestanteRepository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class GestanteRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(GestanteRepositoryTest.class);
	
	@Autowired
	private GestanteRepository gestanteRepository;
	
	@Test
	public void findAllTest(){
		List<GestanteEntity> gestante = this.gestanteRepository.findAll();
		
		if(LOGGER.isInfoEnabled()){
			LOGGER.info("Test FindAll(): "+ gestante);
		}
	}
}
