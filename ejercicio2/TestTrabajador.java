package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class TestTrabajador {
	public static void main(String[] args) {
		Trabajador t1=new Tecnico("Manuel","de la Torre", true);
		Trabajador t2=new Tecnico("Pedro","Sanz", false);
		Trabajador t3=new Oficial("Luis", "Romero","Oficial de primera");
		List <Trabajador> lista=new ArrayList<Trabajador>();
		lista.add(t1);lista.add(t2);lista.add(t3);
		System.out.println(t3.nombreApellidos());
		double sueldototal=0;
		for (Trabajador trabajador : lista) {
			System.out.println(trabajador.getClass());
			System.out.println(trabajador.nombreApellidos());
			
			sueldototal+=trabajador.sueldoMensual(10);
			
			/*if(trabajador instanceof Oficial){
				System.out.println(((Oficial) trabajador).getClass());
			}*/
		}
		System.out.println("Sueldo total de los trabajadores: "+sueldototal);
	}
	
}
