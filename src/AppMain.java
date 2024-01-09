
public class AppMain {

	public static void main(String[] args) {
		

		// Crear objetos de la clase asignatura
		
		Asignatura asig_prog = new Asignatura(485,"Programación");
		// Crear objetos de la clase alumno
		Alumno alum1 = new Alumno(
				"99999999E","Roberto","España","resp@edu.es");		
		// Crear objetos de la clase nota
		
		Nota nota_1 = new Nota(
				alum1,asig_prog,2024,1,8);
		// Imprimir mediante toString los valores
		// de los objetos
		System.out.println("Datos de la Asignatura:");
		System.out.println("------------------------");
		System.out.println(asig_prog.toString());
		System.out.println("Datos del Alumno:");
		System.out.println("------------------------");
		System.out.println(alum1);
		System.out.println("Datos de la Nota:");
		System.out.println("------------------------");
		System.out.println(nota_1);

	}

	
	
}
