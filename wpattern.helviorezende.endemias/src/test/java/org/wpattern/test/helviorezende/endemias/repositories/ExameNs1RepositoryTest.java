package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.examens1entity.ExameNs1Entity;
import org.wpattern.helviorezende.endemias.examens1entity.ExameNs1Repository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class ExameNs1RepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(ExameNs1RepositoryTest.class);
	
	@Autowired
	private ExameNs1Repository exameNs1Repository;
	
	@Test
	public void findAllTest(){
		List<ExameNs1Entity> examens1 = this.exameNs1Repository.findAll();
		
		if(LOGGER.isInfoEnabled()){
			LOGGER.info("Test FindAll(): "+ examens1);
		}
	}
}
