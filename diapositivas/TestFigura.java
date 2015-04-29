package diapositivas;

public class TestFigura {
	public static String datosFigura(Figura f){
		return f+" y su area es "+f.getArea();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura cir=new Circulo("Verde", 12);
		System.out.println(datosFigura(cir));
		Figura cua=new Cuadrado("Negro",15);
		System.out.println(cua);
		Cuadrilatero cuad=new Cuadrado("Verd", 3);
		System.out.println(datosFigura(cuad));
	}
	
}
