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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.AlumnoPrograma;
import edu.moduloalumno.service.IAlumnoProgramaService;

@RestController
@RequestMapping("/alumnoprograma")
@Api(value="AlumnoPrograma", description="Gestion de Pogramas del Alumno")
public class AlumnoProgramaController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IAlumnoProgramaService service;

	@ApiOperation(value="Retorna todos los programas de un Alumno por sus nombres y apellidos", response = AlumnoPrograma.class)
	@GetMapping(value = "/leer/{nombresApellidos}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoPrograma>> getAlumnoProgramasIdByNombresApellidos(
		@ApiParam(value = "Nombres y apellidos del Alumno",required=true) @PathVariable("nombresApellidos") String nombresApellidos) {
		logger.info("> getAlumnoProgramasIdByNombresApellidos [AlumnoPrograma]");

		List<AlumnoPrograma> list = null;
		try {
			list = service.getAlumnoProgramasIdByNombresApellidos(nombresApellidos);

			if (list == null) {
				list = new ArrayList<AlumnoPrograma>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramasIdByNombresApellidos [AlumnoPrograma]");
		return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.OK);
	}

	@ApiOperation(value="Retorna un programa de un Alumno por su Codigo", response = AlumnoPrograma.class)
	@GetMapping(value = "/leer/{codAlum}/{idProg}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoPrograma>> getAlumnoProgramasIdByCodAlumIdProg(
		@ApiParam(value = "Codigo del Alumno",required=true) @PathVariable("codAlum") String codAlum,
		@ApiParam(value = "Id del programa",required=true) @PathVariable("idProg") Integer idProg) {
		logger.info("> getAlumnoProgramasIdByCodAlumIdProg [AlumnoPrograma]");

		List<AlumnoPrograma> list = null;
		try {
			list = service.getAlumnoProgramasIdByCodAlumIdProg(codAlum,idProg);

			if (list == null) {
				list = new ArrayList<AlumnoPrograma>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramasIdByCodAlumIdProg [AlumnoPrograma]");
		return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.OK);
	}
	
	@ApiOperation(value="Retorna todos los programas de un Alumno por sus nombres y apellidos", response = AlumnoPrograma.class)
	@GetMapping(value = "/leer/restringido/{nombresApellidos}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoPrograma>> getAlumnoProgramasIdByNombresApellidosRestringido(
		@ApiParam(value = "Nombres y apellidos del Alumno",required=true) @PathVariable("nombresApellidos") String nombresApellidos) {
		logger.info("> getAlumnoProgramasIdByNombresApellidosRestringido [AlumnoPrograma]");

		List<AlumnoPrograma> list = null;
		try {
			list = service.getAlumnoProgramasIdByNombresApellidosRestringido(nombresApellidos);//

			if (list == null) {
				list = new ArrayList<AlumnoPrograma>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramasIdByNombresApellidosRestringido [AlumnoPrograma]");
		return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.OK);
	}
	
	@ApiOperation(value="Retorna todos programas de todos los Alumnos", response = AlumnoPrograma.class)
	@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoPrograma>> getAllAlumnoPrograma() {
		logger.info("> getAlumnoProgramasIdByNombresApellidosRestringido [AlumnoPrograma]");

		List<AlumnoPrograma> list = null;
		try {
			list = service.getAllAlumnoProgramas();

			if (list == null) {
				list = new ArrayList<AlumnoPrograma>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramasIdByNombresApellidosRestringido [AlumnoPrograma]");
		return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.OK);
	}
	
	@ApiOperation(value="Retorna todos los programas de un Alumno por su Codigo", response = AlumnoPrograma.class)
	@GetMapping(value = "/buscarc/{codAlumno}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AlumnoPrograma> getAlumnoProgramaByCodAlumno(
		@ApiParam(value = "Codigo del Alumno",required=true) @PathVariable("codAlumno") String codAlumno) {
		logger.info("> getAlumnoProgramaByCodAlumno [AlumnoPrograma]");

		AlumnoPrograma alum = null;
		try {
			alum = service.getAlumnoProgramaById(codAlumno);

			if (alum == null) {
				alum = new AlumnoPrograma();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<AlumnoPrograma>(alum, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramaByCodAlumno [AlumnoPrograma]");
		return new ResponseEntity<AlumnoPrograma>(alum, HttpStatus.OK);
	}
	
	@ApiOperation(value="Retorna todos los programas de un Alumno por su DNI", response = AlumnoPrograma.class)
	@GetMapping(value = "/buscard/{dni}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoPrograma>> getAlumnoProgramaByDni(
		@ApiParam(value = "DNI del Alumno",required=true) @PathVariable("dni") String dni) {
		logger.info("> getAlumnoProgramaByDni [DNI]");

		List<AlumnoPrograma> list = null;
		try {
			list = service.getAlumnoProgramaByDni(dni);

			if (list == null) {
				list = new ArrayList<AlumnoPrograma>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramaByCodAlumno [AlumnoPrograma]");
		return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.OK);
	}
}
