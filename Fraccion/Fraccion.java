package Fraccion;

public class Fraccion {
	//Atributos
	
	protected int numerador; //Arriba
	protected int denominador; //Abajo

	
	//Constructor
	
	Fraccion (int numerador, int denominador){
		this.numerador=numerador;
		this.denominador=denominador;
		
	}
	

	
	public Fraccion() {
		// TODO Auto-generated constructor stub
	}



	public String invertirfraccion() {
		
		
		int aux=this.numerador;
		numerador=this.denominador;
		denominador=aux;
		String result="Los parametros han sido cambiados";
		return result;
		
	}

	
	

	
	
	 public int getNumerador() {
		return numerador;
	}



	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}



	public int getDenominador() {
		return denominador;
	}



	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}



	public Fraccion multiplicarfracciones(Fraccion a,Fraccion b) {
			
			
	     Fraccion c=new Fraccion(numerador, denominador);
	     c.numerador=a.getNumerador()*b.getNumerador();
	     c.denominador=a.getDenominador()*b.getDenominador();
	     return c;
	 
	 
	 }
	
	
	public Fraccion multiplicarfracciones(Fraccion b) {
		
		
	     Fraccion c=new Fraccion(numerador, denominador);
	     c.numerador=this.getNumerador()*b.getNumerador();
	     c.denominador=this.getDenominador()*b.getDenominador();
	     return c;
	 
	 
	 }
	
	
	


	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}
	
	
}
