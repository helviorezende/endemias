package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.sorotipo.SorotipoEntity;
import org.wpattern.helviorezende.endemias.sorotipo.SorotipoRepository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class SorotipoRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(ExamePcrRepositoryTest.class);
	
	@Autowired
	private SorotipoRepository sorotipoRepository;
	
	@Test
	public void findAllTest(){
		List<SorotipoEntity> sorotipo = this.sorotipoRepository.findAll();
		
		if(LOGGER.isInfoEnabled()){
			LOGGER.info("Test FindAll(): "+ sorotipo);
		}
	}
}
