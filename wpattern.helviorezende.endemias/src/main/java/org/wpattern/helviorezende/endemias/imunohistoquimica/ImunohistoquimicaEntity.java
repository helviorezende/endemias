package org.wpattern.helviorezende.endemias.imunohistoquimica;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_imunohistoquimica")
@AttributeOverride(name = "id", column = @Column(name = "imunoh_n"))
public class ImunohistoquimicaEntity extends BaseEntity<Long>{
	
	@Column(name = "nm_imunohistoquimica")
	private String NmImunohistoquimica;

	public ImunohistoquimicaEntity() {
		super();		
	}

	public String getNmImunohistoquimica() {
		return NmImunohistoquimica;
	}

	public void setNmImunohistoquimica(String nmImunohistoquimica) {
		NmImunohistoquimica = nmImunohistoquimica;
	}
}
