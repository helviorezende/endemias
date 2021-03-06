package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.hospitalizado.HospitalizadoEntity;
import org.wpattern.helviorezende.endemias.hospitalizado.HospitalizadoRepository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class HospitalizadoRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(HospitalizadoRepositoryTest.class);
	
	@Autowired
	private HospitalizadoRepository hospitalizadoRepository;
	
	@Test
	public void findAllTest(){
		List<HospitalizadoEntity> hospitalizado = this.hospitalizadoRepository.findAll();
		
		if(LOGGER.isInfoEnabled()){
			LOGGER.info("Test FindAll(): "+ hospitalizado);
		}
	}
}
