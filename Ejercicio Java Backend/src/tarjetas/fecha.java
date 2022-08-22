package tarjetas;

public class fecha {

	int dia;
	int mes;
	int año;
	
	//Constructor
	
	public fecha (int day, int month, int year) {
		this.dia = day;
		this.mes = month;
		this.año = year;
		
	}
	
	//Get
	
	public int getDia() {
		return this.dia;
	}
	public int getMes() {
		return this.mes;
	}
	public int getAño() {
		return this.año;
	}
	
	// Set
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public void setAño(int año) {
		this.año = año;
	}
	
	@Override
	public String toString() {
		return " hasta: "+dia+" "+mes+" "+año;
	}
}

