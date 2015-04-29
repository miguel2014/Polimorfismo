package diapositivas;

public class Figura {
	private String color;

	/**
	 * @param color
	 */
	public Figura(String color) {
		this.color = color;
		System.out.println("Creado objeto figura");
	}
	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
	//Esto es mejor hacerlo con interfaces oclases abstractas
	//Definimos un metodo llamado getArea
	public double getArea(){
		return 0;
	}
}
class Circulo extends Figura{
	private double radio;

	/**
	 * @param color
	 * @param radio
	 */
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
		System.out.println("Creado objeto circulo");
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio +" color" + getColor()+"]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}
	
}
class Cuadrilatero extends Figura{
	private double lado1;
	private double lado2;
	/**
	 * @param color
	 * @param lado1
	 * @param lado2
	 */
	public Cuadrilatero(String color, double lado1, double lado2) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	@Override
	public String toString() {
		return "Cuadrilatero [lado1=" + lado1 + ", lado2=" + lado2 + "]";
	}

	//Seria recomendable usar getter
	public double getArea(){
		return this.lado1+this.lado2;
	}
	
}
class Cuadrado extends Cuadrilatero{

	public Cuadrado(String color, double lado) {
		super(color, lado,lado);
	}

	@Override
	public String toString() {
		return "Cuadrado [toString()=" + super.toString() + "]";
	}
	
	
}