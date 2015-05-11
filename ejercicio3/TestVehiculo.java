package ejercicio3;

public class TestVehiculo {
	public static void main(String[] args) {
		Vehiculo coche=new Coche();
		Vehiculo moto=new Motocicleta();
		for (int i = 0; i < 20; i++) {
			int acelerarCoche=(int) (Math.random()*100);
			int acelerarMoto=(int) (Math.random()*100);
			int frenarCoche=(int) (Math.random()*100);
			int frenarMoto=(int) (Math.random()*100);
			System.out.println("Acelarando "+coche.acelerar(acelerarCoche));
			System.out.println("Acelarando "+moto.acelerar(acelerarMoto));
			System.out.println("Frenando "+coche.frenar(frenarCoche));
			System.out.println("Frenando "+moto.frenar(frenarMoto));
			
		}
	}
}
