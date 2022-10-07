package ejerciciosEncapsulacion;


public class encapsulacion {

	public static void main(String[] args) {
		persona datos = new persona();
		datos.setEdad(25);
		datos.setNombre("Anna");
		datos.setTelefono(3154);
	
//	System.out.println(datos.getEdad());
//	System.out.print(datos.getNombre());
//	System.out.println(datos.getTelefono());
	System.out.println(" EDAD: "+datos.getEdad() + "\n NOMBRE: " + datos.getNombre() + "\n TELEFONO: " +datos.getTelefono());
			

	}

}

class persona {
	private int edad;
	private String nombre;
	private int telefono;
	
	public void setEdad(int edad) {
		this.edad = edad;
	
}

public int getEdad() {
	return this.edad;
}

public void setNombre(String nombre) {
	this.nombre = nombre;

}

public String getNombre() {
	return this.nombre;
}


public void setTelefono(int telefono) {
	this.telefono = telefono;
}
public int getTelefono() {
	return this.telefono;
}
}

		