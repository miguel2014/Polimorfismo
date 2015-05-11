package ejercicio1;

public class Cuadrado extends PoligonoRegular {

	public Cuadrado(double longitudLado) {
		super("Cuadrado", longitudLado, 4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(longitudLado, 2);
	}
	
}
