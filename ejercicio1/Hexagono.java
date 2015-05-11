package ejercicio1;

public class Hexagono extends PoligonoRegular {

	public Hexagono(double longitudLado, int nlados) {
		super("Hexagono", longitudLado, nlados);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.getPerimetro()*Math.sqrt(Math.pow(longitudLado, 2))-Math.pow(longitudLado/2,2))/2;
		
	}
	
}
