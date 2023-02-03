package PilotoFormula1;

public class Piloto {
	

	//Atributos
	
	String DriverName;
	int RaceWins;
	int Score;
	
	//Constructores
	Piloto (String nombre, int carreras, int puntos){
		
		this.DriverName=nombre;
		this.RaceWins=carreras;
		this.Score=puntos;
	}
	
	Piloto (String nombre){
		
		this.DriverName=nombre;
		
	}
	
	
	public Piloto() {
		super();
	}
	
	//Getters and Setters
	
	public String getDriverName() {
		return DriverName;
	}


	public void setDriverName(String driverName) {
		DriverName = driverName;
	}


	public int getRaceWins() {
		return RaceWins;
	}


	public void setRaceWins(int raceWins) {
		RaceWins = raceWins;
	}


	public int getScore() {
		return Score;
	}


	public void setScore(int score) {
		Score = score;
	}

	@Override
	public String toString() {
		return "Piloto [DriverName=" + DriverName + ", RaceWins=" + RaceWins + ", Score=" + Score + "]";
	}

	

}
