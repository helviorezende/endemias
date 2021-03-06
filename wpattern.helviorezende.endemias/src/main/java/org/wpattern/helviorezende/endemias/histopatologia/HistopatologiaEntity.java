package org.wpattern.helviorezende.endemias.histopatologia;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_histopatologia")
@AttributeOverride(name = "id", column = @Column(name = "histopa_n"))
public class HistopatologiaEntity extends BaseEntity<Long>{
	
	@Column(name = "nm_histopa_n")
	private String NmHistopatologia;

	public HistopatologiaEntity() {
		super();
	}

	public String getNmHistopatologia() {
		return NmHistopatologia;
	}

	public void setNmHistopatologia(String nmHistopatologia) {
		NmHistopatologia = nmHistopatologia;
	}	
}
