package clases;

public class Persona {
	private String clase;
	private int ID;
	private String nombre;
	private String apellidos;
	private int edad;
	
	Persona(){
		
	}

	public Persona(String Clase) {
		
		this.clase = Clase;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre = Nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void concentrarse () {
		System.out.println("Se está concentrando una persona");
	}
	
	public void viajar() {
		System.out.println("Ha viajado una persona");
	}

	@Override
	public String toString() {
		return " Clase: " + this.clase + " ID:" + this.ID + " Nombre: " + this.nombre + " Apellidos: " + this.apellidos + " Edad: "
				+ this.edad ;
	}
	
	
	
	
	
	

}
