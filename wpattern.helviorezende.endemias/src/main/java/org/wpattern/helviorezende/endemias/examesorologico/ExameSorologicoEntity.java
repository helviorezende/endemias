package org.wpattern.helviorezende.endemias.examesorologico;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_examesorologico")
@AttributeOverride(name = "id", column = @Column(name = "resul_soro"))
public class ExameSorologicoEntity extends BaseEntity<Long>{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_soro")
	private String NmSoro;

	public ExameSorologicoEntity() {
		super();
		
	}

	public String getNmSoro() {
		return NmSoro;
	}

	public void setNmSoro(String nmSoro) {
		NmSoro = nmSoro;
	}
	
}
