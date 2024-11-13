package System;


/**
 * @version 1.0
 * @created 12-nov.-2024 11:37:04 a. m.
 */
public class Administrador {

	private string Email;
	private int Id;
	private string Nombre;
	public SistemaSeguridad m_SistemaSeguridad;

	public Administrador(){

	}

	public void finalize() throws Throwable {

	}

	public string ActualizarCredenciales(){
		return "";
	}

	public int ConfigurarAlertas(){
		return 0;
	}

	public int ConfigurarPuertas(){
		return 0;
	}

	public string ConsutarCredenciales(){
		return "";
	}

	public int CrearCredenciales(){
		return 0;
	}

	public boolean EliminarCredenciales(){
		return false;
	}

	public int GenerarReportes(){
		return 0;
	}

	public int VerificarEstadoPuertas(){
		return 0;
	}

}