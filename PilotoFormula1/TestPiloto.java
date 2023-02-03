package PilotoFormula1;

public class TestPiloto {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		
		Piloto Max = new Piloto(); // Usa un metodo Constructor que no recibe ningun parametro
		
		Piloto LewisHamilton = new Piloto("Lewis Hamilton", 10,150);// Usa un metodo Constructor que recibe los 3
		
		Piloto FernandoAlonso = new Piloto("Fernando Alonso");	// Usa un metodo Constructor que recibe 1 solo parametros
		
		
				System.out.println(Max.toString());
				System.out.println(LewisHamilton.toString());	
				System.out.println(FernandoAlonso.toString());	
				
				Max.setDriverName("Max");
				Max.setRaceWins(2);
				Max.setScore(50);
				
				
				
				System.out.println(Max.toString());
	}

}
