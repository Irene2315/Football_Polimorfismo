package clases;

public class Futbolista extends Persona{
	private int dorsal;
	private String demarcación;
	
	

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
		return demarcación;
	}



	public void setDemarcación(String demarcación) {
		this.demarcación = demarcación;
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
	
}
