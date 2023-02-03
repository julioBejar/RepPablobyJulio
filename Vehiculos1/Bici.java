package Vehiculos1;

public class Bici extends Vehiculos{

	
	
	//Atributos
	@SuppressWarnings("unused")
	private int ruedas;
	@SuppressWarnings("unused")
	private String marca;
	
	//Constructor
	Bici (String marca){
		
		this.marca=marca;
		
		Vehiculos.VehiculosCreados++;
	}
	
	Bici (){
		
		Vehiculos.VehiculosCreados++;
	}
	
	
	//Metodos
	public String caballito() {
		
		
		String result="Yujuuu estoy haciendo el caballito";
		return result;
	}
	
public void andarbici(float km) {
		
		this.km=this.km+km;
		Vehiculos.KmTotal=Vehiculos.KmTotal+km;
	}
	
public String look() {
	
	
	String result="Que bici mas bonita";
	return result;
}

	
	
}
