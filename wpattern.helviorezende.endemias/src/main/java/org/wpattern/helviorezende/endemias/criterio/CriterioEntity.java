package org.wpattern.helviorezende.endemias.criterio;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_criterio")
@AttributeOverride(name = "id", column = @Column(name = "criterio"))
public class CriterioEntity extends BaseEntity<Long>{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nmcriterio")
	private String NmCriterio;

	public CriterioEntity() {
		super();
	}

	public String getNmCriterio() {
		return NmCriterio;
	}

	public void setNmCriterio(String nmCriterio) {
		NmCriterio = nmCriterio;
	}
	
}
