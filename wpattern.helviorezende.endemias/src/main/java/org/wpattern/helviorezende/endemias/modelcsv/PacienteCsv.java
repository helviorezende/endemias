package org.wpattern.helviorezende.endemias.modelcsv;

import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class PacienteCsv {
	
	private String name;
	private Date dataNascimento;
	
	public PacienteCsv() {
	
	}
	

	public PacienteCsv(String name, Date dataNascimento) {
		super();
		this.name = name;
		this.dataNascimento = dataNascimento;
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
	
}
