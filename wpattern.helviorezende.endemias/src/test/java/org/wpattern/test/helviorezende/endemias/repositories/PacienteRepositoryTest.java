package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.paciente.PacienteEntity;
import org.wpattern.helviorezende.endemias.paciente.PacienteRepository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class PacienteRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(PacienteRepositoryTest.class);
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Test
	public void findAllTest(){
		List<PacienteEntity> paciente = this.pacienteRepository.findAll();
		
		if(LOGGER.isInfoEnabled()){
			LOGGER.info("Test FindAll(): "+ paciente);
		}
	}
}