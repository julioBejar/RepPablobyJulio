package Pizzeria;

public class Pizza {
	
	//Atributos
	protected static int PizzasPedidas;



	protected static int PizzasEntregadas;
	
	String tamaño;
	String ingredientes;
	
	String estado="pendiente";
	
	
	//Constructor
	Pizza(String Tamaño, String ingredientes){
		
		
		this.tamaño=Comprobartamaño(Tamaño);
		this.ingredientes=Comprobaringrediente(ingredientes);
		Pizza.PizzasPedidas++;
		
		
		
	}
	
	
	
	
	public String Comprobartamaño(String Tamaño) {
		
		if (Tamaño !="medium" && Tamaño !="family" ) {
			
			Tamaño="medium";
			
		}
		return Tamaño;
			
			
	}
	
	public String Comprobaringrediente(String ingredientes) {
		
		if (ingredientes !="margarita" && ingredientes !="four cheeses" && ingredientes!="funghi" ) {
			
			ingredientes="only tomatoe";
			
		}
		return ingredientes;
			
			
	}
	
	//Getters
	public static int getPizzasPedidas() {
		return PizzasPedidas;
	}


	public static int getPizzasEntregadas() {
		return PizzasEntregadas;
	}



	public void servir() {
		
		
		Pizza.PizzasEntregadas++;
		
	}

	@Override
	public String toString() {
		return "Pizza [tamaño=" + tamaño + ", ingredientes=" + ingredientes + ", estado=" + estado + "]";
	}
	

}
