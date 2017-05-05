package org.wpattern.helviorezende.endemias.userpermission;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_user_permission")
public class UserPermissionEntity extends BaseEntity<UserPermissionKey>{
	
	private static final long serialVersionUID = 1L;

}
