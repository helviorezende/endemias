package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.permission.PermissionEntity;
import org.wpattern.helviorezende.endemias.permission.PermissionRepository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class PermissionRepositoryTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(PermissionRepositoryTest.class);
	
	@Autowired
	private PermissionRepository permissionRepository;
	
	@Test
	public void testFindAll(){
		List<PermissionEntity> permissions = this.permissionRepository.findAll();
		
		LOGGER.info(permissions);
	}

}
