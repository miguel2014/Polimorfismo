package ejercicio1;

public class Cuadrado extends PoligonoRegular {

	public Cuadrado(double longitudLado, int nlados) {
		super("Cuadrado", longitudLado, nlados);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(longitudLado, 2);
	}
	
}
