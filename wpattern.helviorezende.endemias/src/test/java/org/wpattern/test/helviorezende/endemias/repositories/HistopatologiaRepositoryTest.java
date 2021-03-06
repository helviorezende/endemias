package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.histopatologia.HistopatologiaEntity;
import org.wpattern.helviorezende.endemias.histopatologia.HistopatologiaRepository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class HistopatologiaRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(HistopatologiaRepositoryTest.class);
	
	@Autowired
	private HistopatologiaRepository histopatologiaRepository;
	
	@Test
	public void findAllTest(){
		List<HistopatologiaEntity> histopatologia = this.histopatologiaRepository.findAll();
		
		if(LOGGER.isInfoEnabled()){
			LOGGER.info("Test FindAll(): "+ histopatologia);
		}
	}
}
