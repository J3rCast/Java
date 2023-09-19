package logica;

public class Proveedor {
	private int codigo;
	private String nombre;
	private String numeroContacto;

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroContacto() {
		return numeroContacto;
	}
	public void setNumeroContacto(String numeroContacto) {
		this.numeroContacto = numeroContacto;
	}
	public Proveedor(int codigo, String nombre, String numero) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.numeroContacto = numero;
	}
}
