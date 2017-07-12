package modelo;

public class AlumnoCursa {
	
	Alumno alumno;
	Materia[] materias;
	Nota[][] notas;
	
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Materia[] getMaterias() {
		return materias;
	}
	public void setMaterias(Materia[] materias) {
		this.materias = materias;
	}
	public Nota[][] getNotas() {
		return notas;
	}
	public void setNotas(Nota[][] notas) {
		this.notas = notas;
	}

}
