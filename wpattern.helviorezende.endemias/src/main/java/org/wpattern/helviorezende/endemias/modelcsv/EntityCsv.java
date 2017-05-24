package org.wpattern.helviorezende.endemias.modelcsv;

import javax.persistence.Embedded;

public class EntityCsv {


	private PacienteCsv pacienteCsv;
	
	
	public EntityCsv() {
	
	}
	
	

	public EntityCsv(PacienteCsv pacienteCsv) {
		super();
		this.pacienteCsv = pacienteCsv;
	}



	@Embedded
	public PacienteCsv getPacienteCsv() {
		return pacienteCsv;
	}


	public void setPacienteCsv(PacienteCsv pacienteCsv) {
		this.pacienteCsv = pacienteCsv;
	}
	
}
