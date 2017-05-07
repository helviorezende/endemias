package org.wpattern.helviorezende.endemias.examepcr;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_exame_pcr")
@AttributeOverride(name = "id", column = @Column(name = "resul_pcr"))
public class ExamePcrEntity extends BaseEntity<Long>{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_resul_pcr")
	private String NmResulPcr;

	public ExamePcrEntity() {
		super();		
	}

	public String getNmResulPcr() {
		return NmResulPcr;
	}

	public void setNmResulPcr(String nmResulPcr) {
		NmResulPcr = nmResulPcr;
	}
}
