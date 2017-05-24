package org.wpattern.helviorezende.endemias.paciente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wpattern.helviorezende.endemias.modelcsv.EntityCsv;
import org.wpattern.helviorezende.endemias.utils.GenericService;
import org.wpattern.helviorezende.endemias.writecsv.WriteServiceCsv;

@RestController
@RequestMapping(path = "api/private/country")
public class PacienteService extends GenericService<PacienteEntity, Long> {
	
	@Autowired
	private WriteServiceCsv writeServiceCsv;
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@RequestMapping(path = "/writeandlistcsv")
	public List<PacienteEntity> writeAndSaveListCsv() {
		
		List<EntityCsv> entityCsvs = writeServiceCsv.getListOfCountries();
		
		for (EntityCsv entityCSV : entityCsvs) {
			
			
			PacienteEntity paciente = new PacienteEntity();
			paciente.setName(entityCSV.getPacienteCsv().getName());
			paciente.setDataNascimento(entityCSV.getPacienteCsv().getDataNascimento());
			 this.pacienteRepository.save(paciente);
		}
		
		return pacienteRepository.findAll();
	}

}