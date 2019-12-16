package Principal;

import java.util.Scanner;

import Cliente.Cliente;

public class Principal {

	public static void main(String[] args) {
		Cliente.init();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int opcion;
		while(true)
		{
			System.out.print("Usuario: ");
			String user=sc.nextLine();
			System.out.print("Contrase�a: ");
			String pass=sc.nextLine();
			Cliente.autentificarse(user,pass);
			System.out.println("1)CLONE");
			System.out.println("2)PUSH");
			System.out.println("3)PULL");
			System.out.println("4)REMOVE");
			System.out.println("5)CREATE/ADD");
			System.out.println("6)LISTAR");
			opcion=sc.nextInt();
			switch(opcion)
			{
			case 1:
				System.out.println("Introduce el nombre del Repositorio que quieres clonar");
				Scanner sc2=new Scanner(System.in);
				String nombreRepo=sc2.nextLine();
				Cliente.clonar(nombreRepo);
				break;
			case 2:
				System.out.println("Introduce el nombre del Repositorio que quieres subir");
				Scanner sc21=new Scanner(System.in);
				String nombreRepo1=sc21.nextLine();
				Cliente.push(nombreRepo1);
				break;
			case 3:
				System.out.println("Introduce el nombre del Repositorio que quieres traerte");
				Scanner sc211=new Scanner(System.in);
				String nombreRepo11=sc211.nextLine();
				Cliente.pull(nombreRepo11);
				break;
			case 4:
				System.out.println("Introduce el nombre del Repositorio que quieres eliminar");
				Scanner sc2111=new Scanner(System.in);
				String nombreRepo111=sc2111.nextLine();
				Cliente.eliminar(nombreRepo111);
				break;
			case 5:
				System.out.println("Introduce el nombre del Repositorio que quieres crear");
				Scanner sc21111=new Scanner(System.in);
				String nombreRepo1111=sc21111.nextLine();
				Cliente.a�adir(nombreRepo1111);
				break;
			case 6:
				Cliente.listar();
				default:
					break;
			}
		}

	}

}
