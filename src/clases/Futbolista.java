package clases;

public class Futbolista extends Persona{
	private int dorsal;
	private String demarcacion;
	
	

	public Futbolista (String clase) {
		super(clase);
	}



	public int getDorsal() {
		return dorsal;
	}



	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}



	public String getDemarcación() {
		return demarcacion;
	}



	public void setDemarcación(String demarcación) {
		this.demarcacion = demarcación;
	}
	
	public void jugarPartido() {
		System.out.println("El futbolista ha jugado un partido");
	}
	
	public void entrenar() {
		System.out.println("El futbolista ha ido a entrenar");
	}
	public void concentrarse() {
		System.out.println("EL futbolista se ha concentrado");
	}
	public void viajar() {
		System.out.println("EL futbolista esta viajando");
	}
	
	public String toString() {
		return super.toString()+ " Dorsal: " +this.getDorsal() +
	  " Demarcacion: " +this.getDemarcación();
	}
}
