package Vehiculos1;
import java.util.*;

public class TestVehiculo {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		Coche PabloCoche=new Coche("2911 DYY");
		Bici PabloBici=new Bici("BMX");
		
		@SuppressWarnings("unused")
		Bici PacoBici=new Bici();
		
		boolean menu=true;
		while(menu) {
			
			System.out.println("");
			System.out.println("Menu Vehiculos");
			System.out.println("---------------");
			System.out.println("1. Montar en bici");
			System.out.println("2. Hacer el caballito");
			System.out.println("3. Montar en coche");
			System.out.println("4. Quemar rueda");
			System.out.println("5. Observar la bici");
			System.out.println("6. Mirar el km del coche");
			System.out.println("7. Mirar el total de km");
			System.out.println("8. Salir del menu");
			System.out.println("---------------");
			System.out.println("");
			int tecla=sc.nextInt();
			
			switch(tecla) {
			
			case 1:
				System.out.println("Cuantos KM ha hecho la bici: ");
				
				
				float kmandados=sc.nextFloat();
				PabloBici.andarbici(kmandados);
				break;
				
				
			case 2:
				
				System.out.println(PabloBici.caballito());
				break;
				
			case 3:
			
				System.out.println("Cuantos KM ha hecho el coche: ");
				
				
				float kmandados2=sc.nextFloat();
				PabloCoche.andarcoche(kmandados2);
				
				
				break;
			
			case 4:
				System.out.println(PabloBici.quemarrueda());
				System.out.println(PabloCoche.quemarrueda());
				break;
				
			case 5:
				System.out.println(PabloBici.look());
				break;
				
			case 6:
				System.out.println(PabloCoche.getKm());
				break;
				
				
			case 7: 
				System.out.println(Vehiculos.getKmTotal());
				break;
				
			case 8: menu=false;
			break;
			
			}
	
			
		}
		
		
		System.out.println(Vehiculos.getVehiculosCreados());
		System.out.println(Vehiculos.getKmTotal());
		
		
		sc.close();
	}
}
