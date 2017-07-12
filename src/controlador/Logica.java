package controlador;

import modelo.AlumnoCursa;
import utils.Basededatos;

public class Logica {
	
	public AlumnoCursa buscarpor( int matricula ){
		
		Basededatos bd = new Basededatos();
		
		bd.crearBD();
		
		AlumnoCursa[] todos = bd.getNomina();
		
		AlumnoCursa encontrado = null;
		
		for( AlumnoCursa alumnoencurso : todos ){
			
			if ( matricula == alumnoencurso.getAlumno().getMatricula() ) {
				
				encontrado = alumnoencurso;
			}
			
			
		}
		return encontrado;
		
	}

}
