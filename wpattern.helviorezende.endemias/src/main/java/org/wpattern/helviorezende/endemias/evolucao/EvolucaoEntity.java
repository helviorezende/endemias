package org.wpattern.helviorezende.endemias.evolucao;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_evolucao")
@AttributeOverride(name = "id", column = @Column(name = "id_evolucao"))
public class EvolucaoEntity extends BaseEntity<Long>{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_evolucao")
	private String NmEvolucao;

	public EvolucaoEntity() {
		super();
	}

	public String getNmEvolucao() {
		return NmEvolucao;
	}

	public void setNmEvolucao(String nmEvolucao) {
		NmEvolucao = nmEvolucao;
	}
	
}
