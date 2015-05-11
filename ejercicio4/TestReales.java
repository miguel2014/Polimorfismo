package ejercicio4;

public class TestReales {
	public static void main(String[] args) {
		ArraysReales a=new ArraysReales(2);
		System.out.println(a);
		System.out.println("Minimo "+a.minimo());
		System.out.println("Maximo "+a.maximo());
		System.out.println("Total "+a.sumatorio());
	}
}
