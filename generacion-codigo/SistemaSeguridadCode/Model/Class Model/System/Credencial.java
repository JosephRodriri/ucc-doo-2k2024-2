package System;


/**
 * @version 1.0
 * @created 12-nov.-2024 11:37:04 a. m.
 */
public class Credencial implements AccesoPermitido {

	private string estado;
	private date fechaExpiracion;
	private int Id;
	private string Tipo;
	public Trabajador m_Trabajador;
	public SistemaSeguridad m_SistemaSeguridad;

	public Credencial(){

	}

	public void finalize() throws Throwable {

	}

	public int Activar(){
		return 0;
	}

	public int Historial(){
		return 0;
	}

	public int NotificarAcceso(){
		return 0;
	}

	public int RegistraAcceso(){
		return 0;
	}

	public int Revocar(){
		return 0;
	}

	public int VerificarAcceso(){
		return 0;
	}

}