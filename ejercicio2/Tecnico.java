package ejercicio2;

public class Tecnico extends Trabajador{
	private final double PAGA_DIARIA=100;
	@SuppressWarnings("unused")
	private boolean titulacionSuperior;
	/**
	 * @param nombre
	 * @param apellidos
	 * @param titulacionSuperior
	 */
	public Tecnico(String nombre, String apellidos, boolean titulacionSuperior) {
		super(nombre, apellidos);
		this.titulacionSuperior = titulacionSuperior;
	}
	@Override
	protected double sueldoMensual(int diasTrabajados) {
		// TODO Auto-generated method stub
		return PAGA_DIARIA*diasTrabajados;
	}
	
	
	
}
