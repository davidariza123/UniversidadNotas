package General;



public class Estudiante {
	
	private String Nombre;
	private Integer Identificaion;
	
	
	public Estudiante(String nombre, Integer identificaion) {
		
		this.Nombre = nombre;
		this.Identificaion = identificaion;
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Integer getIdentificaion() {
		return Identificaion;
	}

	public void setIdentificaion(Integer identificaion) {
		Identificaion = identificaion;
	}



	
	
	
	
	
	

}
