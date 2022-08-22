package tarjetas;


public class TarjetaCredito {

	String marca;
	String cliente;
	int nroTarjeta;
	fecha FechaVenc; //Composicion
	
	//Constructor
	public TarjetaCredito (String marca, String cliente, int nroTarjeta, int dia, int mes, int año) {
		this.marca = marca;
		this.cliente = cliente;
		this.nroTarjeta = nroTarjeta;
		this.FechaVenc = new fecha(dia,mes,año);
		
	}

//Get

public String getMarca(){
	return this.marca;
}

public String getCliente() {
	return this.cliente;
}

public int getNroTarjeta() {
	return this.nroTarjeta;
}

public fecha getFechaVenc() {
	return this.FechaVenc;
}

//Set

public void setMarca(String marca) {
	this.marca = marca;
}

public void setCliente(String clienteID) {
	this.cliente = clienteID;
}

public void setNroTajreta(int nroTarjeta) {
	this.nroTarjeta = nroTarjeta;
}

public void setFechaVen(fecha FechaV) {
	this.FechaVenc = FechaV;
}

//Operaciones logicas

public boolean validez(int monto) {
	 if(monto < 1000) {
		return true;
	}else {
		return false;
	} 
	
	/*return monto < 1000;
	}*/
}

//

public Double tasa(String marca, fecha fecha) {
	if(marca == "VISA"){
		return (double) (fecha.getAño() / fecha.getMes());
	}else if(marca == "NARA") {
		return fecha.getAño() * 0.5;
	}else if(marca == "AMEX") {
		return fecha.getMes() * 0.1;
	}else {
		return null;
	}
	
}



@Override
public String toString() {
	return "La tarjeta  "+ nroTarjeta +" "+ marca + " del cliente: "+" "+cliente + "tiene validez "+FechaVenc;
}

public boolean equals(Object obj) {
	TarjetaCredito tarjetaComparacion=(TarjetaCredito)obj;
	return this.getMarca().equals(tarjetaComparacion.getMarca());
}

}


