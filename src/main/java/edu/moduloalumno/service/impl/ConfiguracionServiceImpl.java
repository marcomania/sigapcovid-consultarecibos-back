package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IConfiguracionDAO;
import edu.moduloalumno.entity.Configuracion2;
import edu.moduloalumno.service.IConfiguracionService;

@Service
public class ConfiguracionServiceImpl implements IConfiguracionService {
	
	@Autowired
	private IConfiguracionDAO configuracionDAO;

	@Override
	public List<Configuracion2> getAllConfiguracion() {
		return configuracionDAO.getAllConfiguracion();
	}	
}
