package Electrodomesticos;



public class Electrodomesticos {



	protected double preciobase=100;
	protected String color="blanco";
	protected char consumo='F';
	protected float peso=5;
	
	
Electrodomesticos (){
		
	
	}

Electrodomesticos (double preciobase,float peso){
	
	this.preciobase=preciobase;
	this.peso=peso;
}

public Electrodomesticos(double preciobase, String color, char consumo, float peso) {
	
	this.preciobase = preciobase;
	this.color = (color);
	this.consumo = consumo;
	this.peso = peso;
}

public String comprobarColor(String color){
	   
    //Colores disponibles
	
    String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
    boolean encontrado=false;

    for(int i=0;i<colores.length && !encontrado;i++){
          
        if(colores[i].equals(color)){
            encontrado=true;
        }
          
    }
      
    if(encontrado){
        this.color=color;
    }else{
        this.color="blanco";
    }
	return this.color;
      
      
}

public void comprobarconsumo(char letra){
	   
    //Consumo disponible
	
   char letras[]={'A','B','C','D','E','F'};
    boolean encontrado=false;

    for(int i=0;i<letras.length && !encontrado;i++){
          
        if(letras[i]==(letra)){
            encontrado=true;
        }
          
    }
      
    if(encontrado){
        this.consumo=letra;
    }else{
        this.consumo='F';
    }
      
      
}




public double precioFinal(){
    double plus=0;
    switch(consumo){
        case 'A':
            plus+=100;
            break;
        case 'B':
            plus+=80;
            break;
        case 'C':
            plus+=60;
            break;
        case 'D':
            plus+=50;
            break;
        case 'E':
            plus+=30;
            break;
        case 'F':
            plus+=10;
            break;
    }
	
	 if(peso>=0 && peso<19){
         plus+=10;
     }else if(peso>=20 && peso<49){
         plus+=50;
     }else if(peso>=50 && peso<=79){
         plus+=80;
     }else if(peso>=80){
         plus+=100;
     }
	return preciobase+plus;
	
}



public double getPreciobase() {
	return preciobase;
}

public String getColor() {
	return color;
}

public char getConsumo() {
	return consumo;
}

public float getPeso() {
	return peso;
}




}
