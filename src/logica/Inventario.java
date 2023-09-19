package logica;

import java.util.ArrayList;

public class Inventario {
	private ArrayList<Producto> productos;
	private ArrayList<Proveedor> proveedores;
	
	public Inventario() {
		this.productos = new ArrayList<Producto>();
		this.proveedores = new ArrayList<Proveedor>();
	}
	
	/**BUSCAR PRODUCTO*/
	public Producto buscarProducto(int codigo, int stock) {
		for (Producto producto : this.productos) {
			if (producto.getCodigo() == codigo) {
				producto.setStock(producto.getStock() + stock);
				return producto;
			}
		}
		return null;
	}

	/**INGRESAR PRODUCTO*/
	public void ingresarProducto(int codigo, String nombre, float precio, int stock, Proveedor proveedor) {
		Producto producto = this.buscarProducto(codigo, stock);
		if (producto == null) {
			producto = new Producto(codigo, nombre, precio, stock, proveedor);
			this.productos.add(producto);
		}
	}
	
	/**BUSCAR PROVEEDOR*/
	public Proveedor buscarProveedor(int codigo) {
		for (Proveedor proveedor : this.proveedores) {
			if (proveedor.getCodigo() == codigo) {
				return proveedor;
			}
		}
		return null;
	}
	
	/**MOSTRAR TODOS LOS PRODUCTOS*/
	public void mostrarProductos() {
		for (Producto producto : this.productos) {
			System.out.println("Codigo: " + producto.getCodigo() + "\n"
								+ "Nombre: " + producto.getNombre() + "\n"
								+ "Precio: " + producto.getPrecio() + "\n"
								+ "Stock: " + producto.getStock() + "\n");
			this.mostrarProveedorCodigo(producto.getProveedor().getCodigo());
		}
	}
	
	/**MUESTRA EL PROVEEDOR POR CODIGO*/
	public void mostrarProveedorCodigo(int codigo) {
		for (Proveedor proveedor : this.proveedores) {
			if (proveedor.getCodigo() == codigo) {
				System.out.println("Datos del proveedor:\n"
								+ "\tCodigo: " + proveedor.getCodigo() + "\n"
								+ "\tNombre: " + proveedor.getNombre() + "\n"
								+ "\tNumero de contacto: " + proveedor.getNumeroContacto() + "\n");
			}
		}
	}
	
	/**INGRESAR PROVEEDOR*/
	public void ingresarProveedor(int codigo, String nombre, String contacto) {
		Proveedor proveedor = this.buscarProveedor(codigo);
		if (proveedor == null) {
			proveedor = new Proveedor(codigo, nombre, contacto);
			this.proveedores.add(proveedor);
		}
	}
}
