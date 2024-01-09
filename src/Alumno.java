
public class Alumno {

	
	private String dni;
	private String nombre;
	private String apellidos;
	private String email;
	
	public Alumno() 
	{
		
	}
	
	
	public Alumno(String _dni,String _nombre,String _apellidos,String _email) {
		
		
		this.dni = _dni;
		this.nombre = _nombre;
		this.apellidos = _apellidos;
		this.email = _email;
		
	}
	
	public String getDni() {
		
		return this.dni;
	}
	
	public void setDni(String _dni) {
		
		this.dni = _dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		String str ="";
		
		str = this.apellidos + ", " + this.nombre + "\n";
		str = str + this.dni + ", " + this.email+ "\n"; 
		return str;
		
	}
	
	
	
	
}
