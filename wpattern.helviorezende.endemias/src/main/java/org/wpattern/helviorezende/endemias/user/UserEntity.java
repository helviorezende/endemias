package org.wpattern.helviorezende.endemias.user;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.permission.PermissionEntity;
import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_user")
@AttributeOverride(name = "id", column = @Column (name = "pk_id"))
public class UserEntity extends BaseEntity<Long>{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "name", length = 120, nullable = false)
	private String name;
	
	@Column(name = "email", length = 255, nullable = false, unique = true)
	private String email;
	
	@Column(name="password", length = 128, nullable = false)
	private String password;
	
	public UserEntity(){
	}

	public UserEntity(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "tb_user_permission",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "permission_id"))
	private List<PermissionEntity> permissions;

}
