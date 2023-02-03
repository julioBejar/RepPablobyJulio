package Electrodomesticos;

public class Lavadora extends Electrodomesticos{



	//Atributos
	
	private float carga=5;
	
	
	Lavadora(){
		
		
		
		
		
	}
	
	public Lavadora(double preciobase, float peso ) {
		
		this.preciobase=preciobase;
		this.peso=peso;
		
	}

	public Lavadora(double preciobase, String color, char consumo, float peso, float carga) {
		this.color=color;
		this.carga = carga;
		this.consumo=consumo;
		this.preciobase=preciobase;
		this.peso=peso;
		
	
	}

	public float getCarga() {
		return carga;
	}
	
	 public double precioFinal(){
	        //Invocamos el método precioFinal del método padre
		 
	        double preciolavadora=super.precioFinal();
	  
	        //añadimos el código necesario
	        
	        if (carga>30){
	        	preciolavadora+=50;
	        }
	  
	        return preciolavadora;
	    }

	@Override
	
	
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioFinal()=" + precioFinal() + ", getColor()=" + getColor()
				+ ", getConsumo()=" + getConsumo() + ", getPeso()=" + getPeso() + "]";
	}
	
	
}
