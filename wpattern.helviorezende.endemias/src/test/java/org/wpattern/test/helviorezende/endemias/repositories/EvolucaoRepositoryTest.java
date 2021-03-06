package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.evolucao.EvolucaoEntity;
import org.wpattern.helviorezende.endemias.evolucao.EvolucaoRepository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class EvolucaoRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(EvolucaoRepositoryTest.class);
	
	@Autowired
	private EvolucaoRepository evolucaoRepository;
	
	@Test
	public void findAllTest(){
		List<EvolucaoEntity> evolucao = this.evolucaoRepository.findAll();
		
		if(LOGGER.isInfoEnabled()){
			LOGGER.info("Test FindAll(): "+ evolucao);
		}
	}
}
