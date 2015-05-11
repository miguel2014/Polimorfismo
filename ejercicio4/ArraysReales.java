package ejercicio4;

import java.util.Arrays;

public class ArraysReales implements Estadistica {
	private double[] valores;
	
	/**
	 * @param valores
	 * Al constructor se le pasa el tamaño del array y lo rellenamos de forma aleatoria
	 */
	public ArraysReales(int tamaño) {
		//Primero indicamos el tamaño del array sino da error
		if(tamaño<0){
			System.out.println("Error");
			System.exit(0);
		}
		else
		this.valores=new double[tamaño];
		for (int i = 0; i < tamaño; i++) {
			double valor=Math.random()*100;
			valores[i]=valor;
		}
		///Lo ordenamos de forma ascendente
		Arrays.sort(valores);
	}

	@Override
	public double minimo() {
		// TODO Auto-generated method stub
		if(this.valores.length>0)
		return valores[0];
		else
			System.out.println("Array vacio");
			return 0;
	}

	@Override
	public double maximo() {
		// TODO Auto-generated method stub
		if(this.valores.length>0)
			return valores[valores.length-1];
			else
				System.out.println("Array vacio");
				return 0;
		}
	

	@Override
	public double sumatorio() {
		// TODO Auto-generated method stub
		if(this.valores.length>0){
			double suma=0;
			for (int i = 0; i < valores.length; i++) {
				suma+=valores[i];
			}
			return suma;
		}
			else
				System.out.println("Array vacio");
				return 0;
		}

	@Override
	public String toString() {
		return "ArraysReales [valores=" + Arrays.toString(valores) + "]";
	}
	
}
