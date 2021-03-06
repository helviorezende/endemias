package org.wpattern.helviorezende.endemias.gestante;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_gestante")
@AttributeOverride(name = "id", column = @Column(name = "cs_gestante"))
public class GestanteEntity extends BaseEntity<Long>{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_gestant")
	private String NmGestante;
}
