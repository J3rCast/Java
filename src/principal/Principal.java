package principal;
import java.util.Scanner;
import logica.Inventario;
import logica.Proveedor;

public class Principal {
	Inventario inventario = new Inventario();
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.iniciar();
	}
	
	private void iniciar() {
		Scanner sc = new Scanner(System.in);
		int op = -1;
		
		do {
			System.out.println("------------MENU------------\n"
					+ "1. Agregar producto\n"
					+ "2. Mostrar productos\n"
					+ "3. Agregar proveedor\n"
					+ "0. Salir\n");
		
			op = sc.nextInt();
			switch (op) {
				case 1:
					System.out.println("Indique el codigo del proveedor del producto: \n");
					int codigoProveedor = sc.nextInt();
					sc.nextLine();
					Proveedor proveedor = inventario.buscarProveedor(codigoProveedor);
					if (proveedor == null) {
						System.out.println("El proveedor ingresado no existe\n");
						break;
					}
					System.out.println("Ingrese el codigo del producto: \n");
					int codigo = sc.nextInt();
					sc.nextLine();
					System.out.println("Ingrese el nombre del producto: \n");
					String nombre = sc.nextLine();
					System.out.println("Ingrese el precio del producto: \n");
					float precio = sc.nextFloat();
					System.out.println("Ingrese la cantidad en stock del producto: \n");
					int stock = sc.nextInt();
					sc.nextLine();
					inventario.ingresarProducto(codigo, nombre, precio, stock, proveedor);
					break;
				case 2:
					inventario.mostrarProductos();
					break;
				case 3:
					System.out.println("Ingrese codigo del proveedor: ");
					int codigoPro = sc.nextInt();
					sc.nextLine();
					System.out.println("Ingrese el nombre del proveedor: ");
					String nombreProveedor = sc.nextLine();
					System.out.println("Ingrese el numero de contacto del proveedor: ");
					String numeroProveedor = sc.nextLine();
					inventario.ingresarProveedor(codigoPro, nombreProveedor, numeroProveedor);
					break;
			}
		} while (op != 0);
	}
}
