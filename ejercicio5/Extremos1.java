package ejercicio5;

import java.util.Arrays;

public interface Extremos1 {

	public static int min(int[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[0];
	}

	public  static int max(int[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[a.length-1];
	}

	public static double min(double[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[0];
	}

	public static double max(double[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[a.length-1];
	}
	
	static int devuelve2(){return 2;}
}
