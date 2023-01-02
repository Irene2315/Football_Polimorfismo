package clases;

public class Entrenador extends Persona {
	private String titulacion;
	private int aniosExperiencia;
	
	public Entrenador (String clase) {
		super(clase);
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public void dirigirPartido() {
		System.out.println("EL entrenador está dirigiendo partido");
	}
	
	public void dirigirEntrenamiento() {
		System.out.println("EL entrenador está dirigiendo entrenamiento");
	}
	public void concentrarse() {
		System.out.println("EL entrenador se ha concentrado");
	}
	public void viajar() {
		System.out.println("EL entrenador esta viajando");
	}
	
}
