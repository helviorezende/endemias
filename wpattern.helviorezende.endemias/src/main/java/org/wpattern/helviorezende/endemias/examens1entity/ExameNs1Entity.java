package org.wpattern.helviorezende.endemias.examens1entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_exame_ns1")
@AttributeOverride(name = "id",column = @Column(name = "exame_ns1"))
public class ExameNs1Entity extends BaseEntity<Long>{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_resul_ns1")
	private String NmExameNs1;

	public ExameNs1Entity() {
		super();
	
	}

	public String getNmExameNs1() {
		return NmExameNs1;
	}

	public void setNmExameNs1(String nmExameNs1) {
		NmExameNs1 = nmExameNs1;
	}

}
