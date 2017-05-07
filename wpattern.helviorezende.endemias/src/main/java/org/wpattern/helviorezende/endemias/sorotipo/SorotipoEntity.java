package org.wpattern.helviorezende.endemias.sorotipo;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_sorotipo")
@AttributeOverride(name = "id", column = @Column(name = "sorotipo"))
public class SorotipoEntity extends BaseEntity<Long>{
	
	@Column(name = "nm_sorotipo")
	private String NmSorotipo;

	public SorotipoEntity() {
		super();
	}

	public String getNmSorotipo() {
		return NmSorotipo;
	}

	public void setNmSorotipo(String nmSorotipo) {
		NmSorotipo = nmSorotipo;
	}
}
