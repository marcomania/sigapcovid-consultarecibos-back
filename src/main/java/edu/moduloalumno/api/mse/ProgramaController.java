package edu.moduloalumno.api.mse;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.mse.Facultad;
import edu.moduloalumno.entity.mse.Programa;
import edu.moduloalumno.entity.mse.TipoGrado;
import edu.moduloalumno.service.mse.IProgramaService;

@RestController
@RequestMapping("/mse/programa")
public class ProgramaController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IProgramaService service;
	
	@RequestMapping(value = "/listarProgramas", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Programa>> listarPrograma() {
		logger.info("> listarPrograma [List<Programa>]");
		List<Programa> listaPrograma=null;
		try {
			listaPrograma = service.listarProgramas();
			
			if (listaPrograma == null) {
				return null;
			}
			
		} catch (Exception e) {
			
			return new ResponseEntity<List<Programa>>(listaPrograma, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<List<Programa>>(listaPrograma, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/listarTipoGrado", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TipoGrado>> listarTipoGrado() {

		logger.info("> listarTipoGrado [List<TipoGrado>]");
		List<TipoGrado> listaTipoGrado=null;
		try {
			listaTipoGrado = service.listarTipoGrado();
			
			System.out.print(listaTipoGrado);
			if (listaTipoGrado == null) {
				return null;
			}
			
		} catch (Exception e) {
			
			return new ResponseEntity<List<TipoGrado>>(listaTipoGrado, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<List<TipoGrado>>(listaTipoGrado, HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/agregarPrograma",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void agregarPrograma(@RequestBody Programa programa, BindingResult result) {
		logger.info("> agregarPrograma []");
		logger.info("> programa: "+ programa.toString());

		if(result.hasErrors()){
	      System.out.println("Tieene errores");            
	     }
		service.agregarPrograma(programa);

	    }
	
	@RequestMapping(value="/agregarFacultad",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public void agregarFacultad(@RequestBody Facultad facultad, BindingResult result) {
		logger.info("> agregarPrograma []");
		logger.info("> facultad: "+ facultad.toString());
		
		if(result.hasErrors()){
	      System.out.println("Tieene errores");            
	     }
		service.agregarFacultad(facultad);

	    }
	
}
