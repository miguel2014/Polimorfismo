package ejercicio3;

public interface Vehiculo {
	//Todo atributo en una interfaz es static y final,pero no hace falta indicarlo
	//Cualquier metodo es pblico pero no hace falta indicarlo
	int VELOCIDAD_MAXIMA=120;
	String acelerar(int velocidad);
	String frenar(int velocidad);
}
