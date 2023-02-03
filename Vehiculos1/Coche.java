package Vehiculos1;

public class Coche extends Vehiculos {

	
	
	//Atributos
	
	private int numruedas;
	
	private int numpuertas;
	
	private int potencia;
	
	private String matricula;
	
	
	
	
	
	//Constructor
	
	Coche (String matricula){
		
		this.matricula=matricula;
		Vehiculos.VehiculosCreados++;
	}



	public int getNumruedas() {
		return numruedas;
	}



	public void setNumruedas(int numruedas) {
		this.numruedas = numruedas;
	}



	public int getNumpuertas() {
		return numpuertas;
	}



	public void setNumpuertas(int numpuertas) {
		this.numpuertas = numpuertas;
	}



	public int getPotencia() {
		return potencia;
	}



	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}



	public void andarcoche(float km) {
		
		this.km=this.km+km;
		Vehiculos.KmTotal=Vehiculos.KmTotal+km;
	}


	@Override
	public String toString() {
		return "Coche [ numruedas=" + numruedas + ", numpuertas=" + numpuertas + ", potencia=" + potencia
				+ ", matricula=" + matricula + ", km=" + km + " ]";
	}



	
	
	
	
	
	
	
	
	
}
