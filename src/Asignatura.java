
public class Asignatura {

	int codigo;
	String nombre;
	
	
	
	public Asignatura(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}



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

	
	public String toString() {
		String str ="";
		
		str = this.codigo + ", " + this.nombre + "\n";
		
		return str;
		
	}
	
	
	
}
