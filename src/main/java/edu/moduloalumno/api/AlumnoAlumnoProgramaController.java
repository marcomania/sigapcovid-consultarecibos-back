package edu.moduloalumno.api;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.AlumnoAlumnoPrograma;
import edu.moduloalumno.service.IAlumnoAlumnoProgramaService;

@RestController
@RequestMapping("/alumnoalumnoprograma")
@Api(value="Alumno-AlumnoPrograma", description="Gestion de Alumno AlumnoPrograma")
public class AlumnoAlumnoProgramaController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IAlumnoAlumnoProgramaService service;
	
	@RequestMapping(value = "/buscar/{idAlum}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="Retorna Los programas de un Alumno por su codigo", response = AlumnoAlumnoPrograma.class)
	public ResponseEntity<AlumnoAlumnoPrograma> getAlumnoAlumnoProgramaById(
		@ApiParam(value = "Codigo del Alumno",required=true) @PathVariable("idAlum") Integer idAlum) {
		logger.info("> getAlumnoAlumnoProgramaById [AlumnoAlumnoPrograma]");

		AlumnoAlumnoPrograma alum = null;
		try {
			alum = service.getAlumnoAlumnoProgramaById(idAlum);

			if (alum == null) {
				alum = new AlumnoAlumnoPrograma();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<AlumnoAlumnoPrograma>(alum, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoAlumnoProgramaById [AlumnoAlumnoPrograma]");
		return new ResponseEntity<AlumnoAlumnoPrograma>(alum, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoAlumnoPrograma>> getAllAlumnoAlumnoProgramas() {
		logger.info("> getAllAlumnoAlumnoProgramas [AlumnoAlumnoPrograma]");

		List<AlumnoAlumnoPrograma> list = null;
		try {
			list = service.getAllAlumnoAlumnoProgramas();

			if (list == null) {
				list = new ArrayList<AlumnoAlumnoPrograma>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoAlumnoPrograma>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAllAlumnoAlumnoProgramas [AlumnoAlumnoPrograma]");
		return new ResponseEntity<List<AlumnoAlumnoPrograma>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AlumnoAlumnoPrograma> addAlumnoAlumnoPrograma(@RequestBody AlumnoAlumnoPrograma alumnoAlumnoPrograma) {

		logger.info("> addAlumnoAlumnoPrograma [AlumnoAlumnoPrograma]");
		
		AlumnoAlumnoPrograma newAlumnoAlumnoPrograma = null;
		try {
			newAlumnoAlumnoPrograma = service.addAlumnoAlumnoPrograma(alumnoAlumnoPrograma);
		} catch (Exception e) {
			return new ResponseEntity<AlumnoAlumnoPrograma>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("> addAlumnoAlumnoPrograma [AlumnoAlumnoPrograma]");
		return new ResponseEntity<AlumnoAlumnoPrograma>(newAlumnoAlumnoPrograma, HttpStatus.CREATED);
	}

}
