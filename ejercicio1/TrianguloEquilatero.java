package ejercicio1;

public class TrianguloEquilatero extends PoligonoRegular {

	
	public TrianguloEquilatero(double longitudLado, int nlados) {
		super("Triangulo equilatero", longitudLado, nlados);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.sqrt(3)*Math.pow(this.longitudLado, 2)/4;
	}

}
