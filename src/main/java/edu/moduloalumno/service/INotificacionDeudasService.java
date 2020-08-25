package edu.moduloalumno.service;

import edu.moduloalumno.entity.NotificacionDeudas;

public interface INotificacionDeudasService {
	void insertNotificacionDeudas(NotificacionDeudas notifiDeudas);
	void updateNotificacionDeudas(String codigo_alumno);
	

}
