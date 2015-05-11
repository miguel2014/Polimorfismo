package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TestPoligonoRegular {
public static void main(String[] args) {
	PoligonoRegular t=new TrianguloEquilatero(3, 2);
	PoligonoRegular c=new Cuadrado(3, 2);
	PoligonoRegular h=new Hexagono(3,4);
	List <PoligonoRegular> lista=new ArrayList<PoligonoRegular>();
	lista.add(t);lista.add(c);lista.add(h);
	for (PoligonoRegular poligonoRegular : lista) {
		System.out.println(poligonoRegular+" \nArea "+poligonoRegular.getArea()
		+"\nPerimetro "+poligonoRegular.getPerimetro());
	}
	
}
}
