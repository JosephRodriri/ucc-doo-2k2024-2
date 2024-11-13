package System;


/**
 * @version 1.0
 * @created 12-nov.-2024 10:41:53 p. m.
 */
public class Trabajador {

	private credencial Credencial;
	private string Email;
	private int Id;
	private string Nombre;
	public Acceso m_Acceso;

	public Trabajador(){

	}

	public void finalize() throws Throwable {

	}

	public boolean RegisterarSalida(){
		return false;
	}

	public boolean RegistrarEntrada(){
		return false;
	}

}