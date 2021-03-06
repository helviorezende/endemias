package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.imunohistoquimica.ImunohistoquimicaEntity;
import org.wpattern.helviorezende.endemias.imunohistoquimica.ImunohistoquimicaRepository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class ImunohistoquimicaRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(ImunohistoquimicaRepositoryTest.class);
	
	@Autowired
	private ImunohistoquimicaRepository imunohistoquimicaRepository;
	
	@Test
	public void findAllTest(){
		List<ImunohistoquimicaEntity> imunohistoquimica = this.imunohistoquimicaRepository.findAll();
		
		if(LOGGER.isInfoEnabled()){
			LOGGER.info("Test FindAll(): "+ imunohistoquimica);
		}
	}
	
	@Test
	public void testInsert(){
		ImunohistoquimicaEntity imunohistoquimica = new ImunohistoquimicaEntity();
		
		imunohistoquimica.setNmImunohistoquimica("nao realizado");
		
		imunohistoquimica = this.imunohistoquimicaRepository.save(imunohistoquimica);				
		LOGGER.info (imunohistoquimica + " " );
	}
	
}
