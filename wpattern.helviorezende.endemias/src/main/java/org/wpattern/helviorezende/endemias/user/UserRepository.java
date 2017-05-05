package org.wpattern.helviorezende.endemias.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	public UserEntity findByEmail (String email);
	
}
