package ejercicio1;

public abstract class PoligonoRegular {
	private String nombre;
	protected double longitudLado;
	protected int nlados;
	int numeroObjecto=0;
	/**
	 * @param nombre
	 * @param longitudLado
	 * @param nlados
	 */
	public PoligonoRegular(String nombre, double longitudLado, int nlados) {
		this.nombre = nombre;
		this.longitudLado = longitudLado;
		this.nlados = nlados;
	}
	//Obtener perimetro
	protected double getPerimetro(){
		return this.longitudLado*this.nlados;
	}
	//el metodo getArea es abstract lo debe implementar cada clase hija
	public abstract double getArea();
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(longitudLado);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + nlados;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoligonoRegular other = (PoligonoRegular) obj;
		if (Double.doubleToLongBits(longitudLado) != Double
				.doubleToLongBits(other.longitudLado))
			return false;
		if (nlados != other.nlados)
			return false;
		return true;
	}
	@Override
	
	public String toString() {
		return "PoligonoRegular [nombre=" + nombre + ", longitudLado="
				+ longitudLado + ", nlados=" + nlados + "]";
	}
	
}
