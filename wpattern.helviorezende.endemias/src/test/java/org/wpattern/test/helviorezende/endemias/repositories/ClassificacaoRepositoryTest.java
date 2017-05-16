package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.classificacao.ClassificacaoEntity;
import org.wpattern.helviorezende.endemias.classificacao.ClassificacaoRepository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class ClassificacaoRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(ClassificacaoRepositoryTest.class);
	
	@Autowired
	private ClassificacaoRepository classificacaoRepository;
	
	@Test
	public void findAllTest(){
		List<ClassificacaoEntity> classificacao = this.classificacaoRepository.findAll();
		
		if(LOGGER.isInfoEnabled()){
			LOGGER.info("Test FindAll(): "+ classificacao);
		}
	}
}
