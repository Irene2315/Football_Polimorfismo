package clases;

public class Masajista extends Persona {
	private String titulacion;
	private int aniosExperiencia;
	
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
		return aniosExperiencia;
	}

	public void setAniosDeExperiencia(int aniosDeExperiencia) {
		this.aniosExperiencia = aniosDeExperiencia;
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
	
	public String toString() {
		return super.toString()+ " Titulacion: " +this.getTitulacion()
		+ " Añios de experiencia: "+this.getAniosDeExperiencia();
		
	}
	
	

}

