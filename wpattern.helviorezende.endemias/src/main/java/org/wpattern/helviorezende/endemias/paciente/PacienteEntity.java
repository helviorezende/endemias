package org.wpattern.helviorezende.endemias.paciente;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.wpattern.helviorezende.endemias.utils.BaseEntity;

@Entity
@Table(name = "tb_paciente")
@AttributeOverride(name = "idPaciente", column = @Column(name = "id_paciente"))
public class PacienteEntity extends BaseEntity<Long>{
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Size(min = 4, max = 150)
	@Column(name = "nm_paciente", length = 150, nullable = false)
	private String name;
	
	@NotNull
	@Column(name = "dt_nascimento", length = 8, nullable = false)
	private int nascimento;
	
	
	@NotNull
	@Column(name = "nh_idade_n", length = 3, nullable = false)
	private int idade;
	
	
	@NotNull
	@Column(name = "cs_sexo", length = 1, nullable = false )
	private char sexo;
	
	@NotNull
	@Column(name = "cs_gestant", length = 1, nullable = false)
	private int gestante;
	
	@NotNull
	@Column(name = "nm_mae_paciente", length = 150, nullable = false)
	private char mae;
	
	@NotNull
	@Column(name = "id_cns_sus_paciente", length = 15, nullable = false)
	private int cnsPaciente;
	
	@NotNull
	@Column(name="nm_numero", length = 5,nullable = false)
	private int numero;
	
	@NotNull
	@Column(name="nu_telefone", length = 15,nullable=false)
	private int telefone;
	
	public PacienteEntity(){
			}

	public PacienteEntity(String name, int nascimento, int idade, char sexo, int gestante, char mae, int cnsPaciente,
			int numero, int telefone) {
		super();
		this.name = name;
		this.nascimento = nascimento;
		this.idade = idade;
		this.sexo = sexo;
		this.gestante = gestante;
		this.mae = mae;
		this.cnsPaciente = cnsPaciente;
		this.numero = numero;
		this.telefone = telefone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getGestante() {
		return gestante;
	}

	public void setGestante(int gestante) {
		this.gestante = gestante;
	}

	public char getMae() {
		return mae;
	}

	public void setMae(char mae) {
		this.mae = mae;
	}

	public int getCnsPaciente() {
		return cnsPaciente;
	}

	public void setCnsPaciente(int cnsPaciente) {
		this.cnsPaciente = cnsPaciente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
