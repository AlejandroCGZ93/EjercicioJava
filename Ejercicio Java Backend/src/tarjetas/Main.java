package tarjetas;
import java.util.Scanner;



public class Main {

	

	public static void main(String[] args) {
		//Creando Object
		TarjetaCredito Visa = new TarjetaCredito("VISA", "José Pepe",0123,13,10,22 );
		System.out.println(Visa.toString());
		
		TarjetaCredito Naranja = new TarjetaCredito("NARA", "Giselle",4567,10,07,20);
		System.out.println(Naranja.toString());
		
		TarjetaCredito AmericanExpress = new TarjetaCredito("AMEX", "Joe Doe",8901,23,02,25);
		System.out.println(AmericanExpress.toString());
		
		//Metodo Equals para identificar las tarjetas
		System.out.println(Visa.equals(Naranja));
		System.out.println(Visa.equals(AmericanExpress));
		System.out.println(Naranja.equals(AmericanExpress));
		
		//Tasas/Fecha
		
		fecha fechaCorrecta = new fecha(13,10,22);
		
		System.out.println(Visa.tasa("VISA", fechaCorrecta));
	
		fecha fechaCorrecta2 = new fecha(10,07,20);
		System.out.println(Visa.tasa("NARA", fechaCorrecta2));
		
		fecha fechaCorrecta3 = new fecha(23,02,25);
		System.out.println(Visa.tasa("AMEX", fechaCorrecta3));
		
			
	}
}
	


