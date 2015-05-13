package ejercicio2;

public class Oficial extends Trabajador {
	private final double PAGA_DIARIA=100;
	private String clase;

	public Oficial(String nombre, String apellidos,String tipo) {
		super(nombre, apellidos);
		this.clase=tipo;
		// TODO Auto-generated constructor stub
	}
	
	public String getClase() {
		return clase;
	}

	@Override
	protected double sueldoMensual(int diasTrabajados) {
		// TODO Auto-generated method stub
		return diasTrabajados*PAGA_DIARIA;
	}
	
}
