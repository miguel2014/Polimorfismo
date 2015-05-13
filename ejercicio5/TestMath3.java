package ejercicio5;

public class TestMath3 {
	public static void main(String[] args) {
		int[] numerosEnteros={5,1,5,2,4,4,5,7,5,1};
		double[] numerosReales={4.3,5,1,22,3,123,2,3,2,22,12};
		Math3 m=new Math3();
		System.out.println(m.max(numerosEnteros));
		System.out.println(m.max(numerosReales));
		System.out.println(m.min(numerosEnteros));
		System.out.println(m.min(numerosReales));
		
		
	}
}
