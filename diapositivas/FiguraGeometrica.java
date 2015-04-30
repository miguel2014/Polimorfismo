package diapositivas;

public abstract class FiguraGeometrica {
	private String nombre;

	/**
	 * @param nombre
	 */
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica [nombre=" + nombre + "]";
	}
	public abstract double getArea();
}
 abstract class FiguraCirculo extends FiguraGeometrica{
	private double radio;

	/**
	 * @param nombre
	 * @param radio
	 */
	public FiguraCirculo(String nombre, double radio) {
		super(nombre);
		this.radio = radio;
	}
	@Override
	public double getArea(){
		return Math.pow(radio, 2)*Math.PI;
	}
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", nombre=" + getNombre() + "]";
	}
	
}
 abstract class FiguraCuadrilatero extends FiguraGeometrica{
	 private double lado1;
	 private double lado2;
	/**
	 * @param nombre
	 * @param lado1
	 * @param lado2
	 */
	public FiguraCuadrilatero(String nombre, double lado1, double lado2) {
		super(nombre);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	public double getLado1() {
		return lado1;
	}
	public double getLado2() {
		return lado2;
	}
	
 }
 abstract class FiguraCuadrado extends FiguraCuadrilatero{

	public FiguraCuadrado( double lado) {
		super("Cuadrado", lado, lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(getLado1(),2);
	}
	 
	 
 }