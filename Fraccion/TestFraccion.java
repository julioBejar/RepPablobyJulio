package Fraccion;
import java.util.*;


public class TestFraccion {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		
		System.out.println("Dime el numerador");
		int numerador=sc.nextInt();
		
		System.out.println("Dime el denominador");
		int denominador=sc.nextInt();
		
		Fraccion fraccion1=new Fraccion(numerador,denominador);
		
		 // System.out.println(fraccion1.invertirfraccion());
		
	
		System.out.println("Dime el numerador");
		int numerador2=sc.nextInt();
		
		System.out.println("Dime el denominador");
		int denominador2=sc.nextInt();
		Fraccion fraccion2=new Fraccion(numerador2,denominador2);
		
		Fraccion fraccionaux=new Fraccion();
		
		System.out.println(fraccionaux.multiplicarfracciones(fraccion1,fraccion2));
		
		System.out.println(fraccion1.multiplicarfracciones(fraccion2));
		

		
		
		
		
		
		
		
		
		sc.close();
	}

}
