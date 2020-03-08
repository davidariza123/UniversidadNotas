package General;

public class Nota {
	private Estudiante estudiante;
	
	private String Materia ;
	
	private Double nota ;

	public Nota(Estudiante estudiante, String materia, Double nota) {
		
		this.estudiante = estudiante;
		Materia = materia;
		this.nota = nota;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public String getMateria() {
		return Materia;
	}

	public void setMateria(String materia) {
		Materia = materia;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public void Agregar (Double n) throws Error{
		
		if (n >= 0 && n <= 5 ) {
			
			nota = n + nota;
			
			System.out.println("ID "+estudiante.getIdentificaion()+" La nota de "+ estudiante.getNombre() +" En "+ Materia +" Es "  + nota);
			
			
		}else {
			
		
		throw new Error("Error, la nota de " +estudiante.getNombre() +"debe estar entre 0.0 y 5.0"); 
		}
	}
	
	

}
