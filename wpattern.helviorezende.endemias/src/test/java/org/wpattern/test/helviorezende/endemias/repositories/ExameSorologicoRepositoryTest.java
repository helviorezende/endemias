package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.examesorologico.ExameSorologicoEntity;
import org.wpattern.helviorezende.endemias.examesorologico.ExameSorologicoRepository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class ExameSorologicoRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(ExameSorologicoRepositoryTest.class);
	
	@Autowired
	private ExameSorologicoRepository exameSorologicoRepository;
	
	@Test
	public void findAllTest(){
		List<ExameSorologicoEntity> sorologico = this.exameSorologicoRepository.findAll();
		
		if(LOGGER.isInfoEnabled()){
			LOGGER.info("Test FindAll(): "+ sorologico);
		}
	}
}
