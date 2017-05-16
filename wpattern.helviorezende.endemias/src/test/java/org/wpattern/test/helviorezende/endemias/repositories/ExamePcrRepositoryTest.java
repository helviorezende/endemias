package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.examepcr.ExamePcrEntity;
import org.wpattern.helviorezende.endemias.examepcr.ExamePcrRepository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class ExamePcrRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(ExamePcrRepositoryTest.class);
	
	@Autowired
	private ExamePcrRepository examePcrRepository;
	
	@Test
	public void findAllTest(){
		List<ExamePcrEntity> examepcr = this.examePcrRepository.findAll();
		
		if(LOGGER.isInfoEnabled()){
			LOGGER.info("Test FindAll(): "+ examepcr);
		}
	}
	
}
