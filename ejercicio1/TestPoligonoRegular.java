package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TestPoligonoRegular {
public static void main(String[] args) {
	PoligonoRegular t=new TrianguloEquilatero(3, 2);
	PoligonoRegular c=new Cuadrado(3);
	PoligonoRegular h=new Hexagono(3,4);
	List <PoligonoRegular> lista=new ArrayList<PoligonoRegular>();
	lista.add(t);lista.add(c);lista.add(h);
	for (PoligonoRegular poligonoRegular : lista) {
		System.out.println(poligonoRegular+" \nArea "+poligonoRegular.getArea()
		+"\nPerimetro "+poligonoRegular.getPerimetro());
	}
	PoligonoRegular t1=new TrianguloEquilatero(4, 4);
	PoligonoRegular t2=new TrianguloEquilatero(4, 5);
	PoligonoRegular t3=new TrianguloEquilatero(4, 6);
	lista.add(t1);
	lista.add(t2);
	lista.add(t3);
	for (PoligonoRegular poligonoRegular : lista) {
		if(poligonoRegular.equals(lista.get(0)))
			System.out.println(poligonoRegular+" es igual a "+lista.get(0));
	}
	
	
}
}
