package practicavectores2;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<alumnnosej1> alumnos = new Vector<alumnnosej1>();
		Scanner scanner = new Scanner(System.in);
		int opcion;
		do {

			System.out.println("\n1.alta\n2.modificar\n3.sustituir alumno\n4.borrar\n5.mostrar\n6.salir");
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1: {
				scanner.nextLine();
				System.out.println("Anota nombre del alumno");
				String nombre=scanner.nextLine();
				/*if (buscarAlumno(alumnos,nombre)!=-1)*/ 
				if(alumnos.indexOf(new alumnnosej1 (nombre))!=-1){
					System.out.println("Alumno ya existe");
				}
				else {
					System.out.println("Introduce nota");
					double nota=scanner.nextDouble();
					alumnos.add(new alumnnosej1(nota,nombre));
					
				}
				break;
			}
			case 5: {
				System.out.println(alumnos);
			}
			case 2:{
				int pos = 0;
				alumnos.get(pos);
			}
			}
		} while (opcion != 6);
    
		
		
	}
	/*public static int buscarAlumno(Vector<String> al.String alumno) {
		for(int i=0;i<al.size();i++) {
			if(al.get(i).getnombre().equals(alumno))
					return 1;
		}
	}
*/
}