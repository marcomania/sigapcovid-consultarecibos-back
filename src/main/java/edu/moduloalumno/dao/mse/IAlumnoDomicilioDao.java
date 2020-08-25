package edu.moduloalumno.dao.mse;

import edu.moduloalumno.entity.mse.*;

public interface IAlumnoDomicilioDao {
    
	public void save(AlumnoDomicilio alumnoDomicilio);
	public AlumnoDomicilio findOne(Integer id);
	public void update(AlumnoDomicilio alumnoDomicilio);
}