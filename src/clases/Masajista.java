package clases;

public class Masajista extends Persona {
	private String titulacion;
	private int aniosDeExperiencia;
	
	public Masajista(String clase) {
		super(clase);
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosDeExperiencia() {
		return aniosDeExperiencia;
	}

	public void setAniosDeExperiencia(int aniosDeExperiencia) {
		this.aniosDeExperiencia = aniosDeExperiencia;
	}
	
	public void darMasaje() {
		System.out.println("Un masajista ha dado un masaje");
	}
	public void concentrarse() {
		System.out.println("EL masajista se ha concentrado");
	}
	public void viajar() {
		System.out.println("EL masajista esta viajando");
	}
	

}

