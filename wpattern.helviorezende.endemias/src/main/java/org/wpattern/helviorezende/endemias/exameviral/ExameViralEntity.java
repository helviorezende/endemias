package org.wpattern.helviorezende.endemias.exameviral;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_exame_viral")
@AttributeOverride(name = "id", column = @Column(name = "resul_vi_n"))
public class ExameViralEntity extends BaseEntity<Long>{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_resul_vi")
	private String NmResulVi;

	public ExameViralEntity() {
		super();		
	}

	public String getNmResulVi() {
		return NmResulVi;
	}

	public void setNmResulVi(String nmResulVi) {
		NmResulVi = nmResulVi;
	}
	
	
}
