package ejercicio3;

public class Coche implements Vehiculo {
	private int velocidad=0;
	//No creo constructor pues cuando cree un nuevo coche la velocidad 
	//es el unico atrivuto se inicializa a 0
	//Para crear un new Coche() trabajamos con el constructor por defecto
	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		this.velocidad+=velocidad;
		String mensaje="Coche con velocidad actual de "+this.velocidad;
		if(this.velocidad>VELOCIDAD_MAXIMA)
			mensaje+=" y has superado la velocidad maxima";
		return mensaje;
	}

	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		this.velocidad-=velocidad;
		if(this.velocidad<0)
			this.velocidad=0;
		String mensaje="Coche con velocidad actual de "+this.velocidad;
		if(this.velocidad>VELOCIDAD_MAXIMA)
			mensaje+=" y has superado la velocidad maxima";
		return mensaje;
	}
	
}
