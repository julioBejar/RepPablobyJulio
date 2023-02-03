package Pizzeria;

public class TestPizza {
	public static void main(String [] args) {
		
		
		Pizza p1 = new Pizza("medium","margarita");
		Pizza p2 = new Pizza("family", "funghin"); 
		Pizza p3 = new Pizza("medium", "four cheeses"); 
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		p2.servir(); 
		
		System.out.println("Pedidas: " + Pizza.getPizzasPedidas());
		System.out.println("Entregadas: " + Pizza.getPizzasEntregadas()); 
		
		
	}

}
