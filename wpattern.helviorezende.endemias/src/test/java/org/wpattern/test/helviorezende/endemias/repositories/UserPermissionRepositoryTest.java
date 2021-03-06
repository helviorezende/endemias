package org.wpattern.test.helviorezende.endemias.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.endemias.userpermission.UserPermissionEntity;
import org.wpattern.helviorezende.endemias.userpermission.UserPermissionRepository;
import org.wpattern.test.helviorezende.endemias.utils.AbstractTest;

public class UserPermissionRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(UserPermissionRepositoryTest.class);
	
	@Autowired
	private UserPermissionRepository userPermissionRepository;
	
	@Test
	public void testFindAll(){
		List<UserPermissionEntity> userPermission = this.userPermissionRepository.findAll();		
		
		LOGGER.info(userPermission);
	}

}
