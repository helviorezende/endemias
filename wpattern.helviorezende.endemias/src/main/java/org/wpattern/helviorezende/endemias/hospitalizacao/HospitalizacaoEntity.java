package org.wpattern.helviorezende.endemias.hospitalizacao;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_hospitalizacao")
@AttributeOverride(name = "id", column = @Column(name = "id_hospitalizacao"))
public class HospitalizacaoEntity extends BaseEntity<Long>{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "id_paciente")
	private Long idPaciente;
	
	@Column(name = "dt_interna")
	private Date dtInterna;
	
	@Column(name = "id_unidadeSaude")
	private Long idUnidadeSaude;
	
	@Column(name = "id_hospitalizado")
	private Long idHospitalizado;

	public HospitalizacaoEntity() {
		super();
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Date getDtInterna() {
		return dtInterna;
	}

	public void setDtInterna(Date dtInterna) {
		this.dtInterna = dtInterna;
	}

	public Long getIdUnidadeSaude() {
		return idUnidadeSaude;
	}

	public void setIdUnidadeSaude(Long idUnidadeSaude) {
		this.idUnidadeSaude = idUnidadeSaude;
	}

	public Long getIdHospitalizado() {
		return idHospitalizado;
	}

	public void setIdHospitalizado(Long idHospitalizado) {
		this.idHospitalizado = idHospitalizado;
	}
}
