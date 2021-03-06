package org.wpattern.helviorezende.endemias.classificacao;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_classificacao")
@AttributeOverride(name = "id", column = @Column(name = "classi_fin"))
public class ClassificacaoEntity extends BaseEntity<Long> {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_classificacao")
	private String NmClassificacao;

	public ClassificacaoEntity() {
		super();

	}

	public String getNmClassificacao() {
		return NmClassificacao;
	}

	public void setNmClassificacao(String nmClassificacao) {
		NmClassificacao = nmClassificacao;
	}
	
	
	
}
