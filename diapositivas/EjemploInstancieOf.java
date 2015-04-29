package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class EjemploInstancieOf {
	private static List<Persona> lista=new ArrayList<Persona>();
	public static void main(String[] args) {
		Persona p1=new Profesores("Edu", 122,"Historia",true);
		Persona p2=new Profesores("Joe", 54, "Informatica",false);
		Persona p3=new Alumno("Nolose", 12, "9");
		System.out.println(p1+"\n"+p2+"\n"+p3);
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		System.out.println(p1.getEdad()+"\n"+p2.getEdad()+"\n"+p3.getEdad());
		for (Persona persona : lista) {
			if (persona instanceof Profesores) {
				System.out.println(((Profesores)persona).esInterino());
			}
			if (persona instanceof Alumno) {
				System.out.println(((Alumno)persona).esmayorEdad());
			}
		}
		
	}
}
class Persona{
	private String nombre;
	private int edad;
	/**
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
class Profesores extends Persona{
	private String asignatura;
	private boolean interino;

	/**
	 * @param nombre
	 * @param edad
	 * @param asignatura
	 */
	public Profesores(String nombre, int edad, String asignatura,boolean interino) {
		super(nombre, edad);
		this.asignatura = asignatura;
		this.interino=interino;
	}
	public boolean esInterino(){
		return this.interino;
	}
	
	@Override
	public String toString() {
		return "Profesores [asignatura=" + asignatura + ", getNombre()="
				+ getNombre() + ", getEdad()=" + getEdad() + "]";
	}
	
	
	
}
class Alumno extends Persona{
	private String curso;

	/**
	 * @param nombre
	 * @param edad
	 * @param curso
	 */
	public Alumno(String nombre, int edad, String curso) {
		super(nombre, edad);
		this.curso = curso;
	}
	public boolean esmayorEdad(){
		return getEdad()>17;
	}
	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", getNombre()=" + getNombre() + "]";
	}
	
	
	
}