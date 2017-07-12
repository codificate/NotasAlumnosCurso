package utils;

import modelo.Alumno;
import modelo.AlumnoCursa;
import modelo.Materia;
import modelo.Nota;

public class Basededatos {
	
	Alumno[] alumnos;
	Materia[] materias;
	AlumnoCursa[] nomina;
	
	public void crearBD(){
		
		setAlumnos();
		setMaterias();
		setNomina();
		
	}
	
	
	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public Materia[] getMaterias() {
		return materias;
	}
	
	public AlumnoCursa[] getNomina() {
		return nomina;
	}
	
	public void setAlumnos() {
		
		Alumno grecia = new Alumno();
		grecia.setNombre( "Grecia" );
		grecia.setMatricula( 54321 );
		this.alumnos[0] = grecia;
		
		Alumno servando = new Alumno();
		servando.setNombre( "Servando" );
		servando.setMatricula( 12345 );
		this.alumnos[1] = servando;
		
	}
	
	public void setMaterias() {
		
		this.materias = new Materia[9];
		
		Materia matematica = new Materia();
		matematica.setNombre( "Matematica" );
		
		this.materias[0] = matematica;
		
		Materia quimica = new Materia();
		quimica.setNombre( "Quimica" );
		
		this.materias[1] = quimica;
		
		Materia fisica = new Materia();
		fisica.setNombre( "Fisica" );
		
		this.materias[2] = fisica;

		Materia biologia = new Materia();
		biologia.setNombre( "Biologia" );
		
		this.materias[3] = biologia;
		
		Materia castellano = new Materia();
		castellano.setNombre( "Castellano" );
		
		this.materias[4] = castellano;
		
		Materia historia = new Materia();
		historia.setNombre( "Historia" );
		
		this.materias[5] = historia;
		
		Materia deporte = new Materia();
		deporte.setNombre( "Deporte" );
		
		this.materias[6] = deporte;
		
	}
	public void setNomina() {
		
		AlumnoCursa uno = new AlumnoCursa();		
		AlumnoCursa dos = new AlumnoCursa();
		
		Materia[] materiasUNO = { this.materias[4], this.materias[6] };
		//Dos materias Una nota 
		Nota[][] notasUNO = new Nota[2][1];
		
		Nota castellano = new Nota();
		castellano.setFecha("01-07-2017");
		castellano.setCalificacion( 4 );
		
		Nota deporte = new Nota();
		deporte.setFecha("03-07-2017");
		deporte.setCalificacion( 6 );
		
		notasUNO[0][0] = castellano;
		notasUNO[1][0] = deporte;
		
		uno.setAlumno( getAlumnos()[1] );
		uno.setMaterias( materiasUNO );
		uno.setNotas( notasUNO );
		
		Materia[] materiasDOS = { this.materias[2], this.materias[5] };
		Nota[][] notasDOS = new Nota[2][1];
		
		Nota fisica = new Nota();
		fisica.setFecha("01-07-2017");
		fisica.setCalificacion( 10 );
		
		Nota historia = new Nota();
		historia.setFecha("03-07-2017");
		historia.setCalificacion( 6 );
		
		notasDOS[0][0] = fisica;
		notasDOS[1][0] = historia;
		
		dos.setAlumno( getAlumnos()[0] );
		dos.setMaterias( materiasDOS );
		dos.setNotas( notasDOS );
	}

}
