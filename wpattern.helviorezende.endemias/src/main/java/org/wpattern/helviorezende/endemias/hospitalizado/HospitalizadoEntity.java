package org.wpattern.helviorezende.endemias.hospitalizado;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_hospitalizado")
@AttributeOverride(name = "id", column = @Column(name = "id_hospitalizado"))
public class HospitalizadoEntity extends BaseEntity<Long>{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_hospitalizado")
	private String NmHospitalizado;

	public HospitalizadoEntity() {
		super();
	}

	public String getNmHospitalizado() {
		return NmHospitalizado;
	}

	public void setNmHospitalizado(String nmHospitalizado) {
		NmHospitalizado = nmHospitalizado;
	}
	
	
	
	
}
