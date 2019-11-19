
public class Autor {

	private String nombre;
	private String apellidos;
	private int ip;
	@SuppressWarnings("unused")
	private String contraseņa;
	private Autor()
	{
		this.nombre=null;
		this.apellidos=null;
		this.ip=0;
		this.contraseņa="admin";
		
	}
	private Autor(String nombre,String apellidos,int ip, String contraseņa)
	{
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.ip=ip;
		this.contraseņa=contraseņa;
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
	public int getIp() {
		return ip;
	}
	public void setIp(int ip) {
		this.ip = ip;
	}
	
}
