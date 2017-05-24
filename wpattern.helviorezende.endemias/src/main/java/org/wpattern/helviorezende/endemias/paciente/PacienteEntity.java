package org.wpattern.helviorezende.endemias.paciente;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_paciente")
@AttributeOverride(name = "id", column = @Column(name = "id_paciente"))
public class PacienteEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 1L;

	@NotNull
	@Size(min = 4, max = 150)
	@Column(name = "nm_paciente", length = 150, nullable = false)
	private String name;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_nascimento")
	private Date dataNascimento;

	/*
	 * @NotNull
	 * 
	 * @Column(name = "nh_idade_n", length = 3, nullable = false) private int
	 * Idade;
	 * 
	 * 
	 * @NotNull
	 * 
	 * @Column(name = "cs_sexo", length = 1, nullable = false ) private char
	 * Sexo;
	 * 
	 * @NotNull
	 * 
	 * @Column(name = "nm_mae_pac", length = 150, nullable = false) private char
	 * nmMae;
	 * 
	 * @NotNull
	 * 
	 * @Column(name = "id_cns_sus_paciente", length = 15, nullable = false)
	 * private int cnsPaciente;
	 * 
	 * @NotNull
	 * 
	 * @Column(name="nm_numero", length = 5,nullable = false) private int
	 * Numero;
	 * 
	 * @NotNull
	 * 
	 * @Column(name="nu_telefone", length = 15,nullable=false) private int
	 * Telefone;
	 * 
	 * @NotNull
	 * 
	 * @Column(name = "cs_gestante", length = 1, nullable=false) private int
	 * csGestante;
	 * 
	 * @NotNull
	 * 
	 * @Column(name = "codlogradouro", length = 11, nullable=false) private int
	 * codLogradouro;
	 */

	public PacienteEntity() {
		super();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/*
	 * public int getIdade() { return Idade; }
	 * 
	 * public void setIdade(int idade) { Idade = idade; }
	 * 
	 * public char getSexo() { return Sexo; }
	 * 
	 * public void setSexo(char sexo) { Sexo = sexo; }
	 * 
	 * public char getNmMae() { return nmMae; }
	 * 
	 * public void setNmMae(char nmMae) { this.nmMae = nmMae; }
	 * 
	 * public int getCnsPaciente() { return cnsPaciente; }
	 * 
	 * public void setCnsPaciente(int cnsPaciente) { this.cnsPaciente =
	 * cnsPaciente; }
	 * 
	 * public int getNumero() { return Numero; }
	 * 
	 * public void setNumero(int numero) { Numero = numero; }
	 * 
	 * public int getTelefone() { return Telefone; }
	 * 
	 * public void setTelefone(int telefone) { Telefone = telefone; }
	 * 
	 * public int getCsGestante() { return csGestante; }
	 * 
	 * public void setCsGestante(int csGestante) { this.csGestante = csGestante;
	 * }
	 * 
	 * public int getCodLogradouro() { return codLogradouro; }
	 * 
	 * public void setCodLogradouro(int codLogradouro) { this.codLogradouro =
	 * codLogradouro; }
	 */

}
